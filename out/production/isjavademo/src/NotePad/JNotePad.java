package NotePad;

import java.awt.*;
import java.awt.event.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.*;

public class JNotePad extends JFrame {
    private JMenuBar menuBar;
    private JMenu fileMenu;
    private JMenuItem menuOpen;
    private JMenuItem menuSave;
    private JMenuItem menuSaveAs;
    private JMenuItem menuClose;

    private JMenu editMenu;
    private JMenuItem menuCut;
    private JMenuItem menuCopy;
    private JMenuItem menuPaste;

    private JMenu aboutMenu;
    private JMenuItem menuAbout;

    private JTextArea textArea;
    private JLabel stateBar;

    private JPopupMenu popUpMenu;

    private TextDAO textDAO;

    private JFileChooser fileChooser;

    public JNotePad(TextDAO textDAO) {
        this();
        this.textDAO = textDAO;
    }

    public JNotePad() {
        initComponents();
        initEventListeners();
    }

    private void initComponents() {
        setTitle("���������֙n��");
        setSize(400, 300);
        initFileMenu();
        initEditMenu();
        initAboutMenu();
        initMenuBar();
        initTextArea();
        initStateBar();
    }

    private void initTextArea() {
        // ���־�݋�^��
        textArea = new JTextArea();
        textArea.setFont(new Font("�����w", Font.PLAIN, 16));
        textArea.setLineWrap(true);
        JScrollPane panel = new JScrollPane(textArea,
                ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
                ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        getContentPane().add(panel, BorderLayout.CENTER);
    }

    private void initMenuBar() {
        // �x����
        menuBar = new JMenuBar();
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(aboutMenu);
        // �O���x����
        setJMenuBar(menuBar);
        // �ĬF�x��
        popUpMenu = editMenu.getPopupMenu();
        // �_���n����Ԓ���K
        fileChooser = new JFileChooser();
    }

    private void initStateBar() {
        // ��B��
        stateBar = new JLabel("δ�޸�");
        stateBar.setHorizontalAlignment(SwingConstants.LEFT);
        stateBar.setBorder(
                BorderFactory.createEtchedBorder());
        getContentPane().add(stateBar, BorderLayout.SOUTH);
    }

    private void initAboutMenu() {
        // �O�á��P춡��x��
        aboutMenu = new JMenu("�P�");
        menuAbout = new JMenuItem("�P�JNotePad");
        aboutMenu.add(menuAbout);
    }

    private void initEditMenu() {
        // �O�á���݋���x��
        editMenu = new JMenu("��݋");
        menuCut = new JMenuItem("����");
        menuCopy = new JMenuItem("�}�u");
        menuPaste = new JMenuItem("�N��");

        editMenu.add(menuCut);
        editMenu.add(menuCopy);
        editMenu.add(menuPaste);
    }

    private void initFileMenu() {
        // �O�á��n�����x��
        fileMenu = new JMenu("�n��");
        menuOpen = new JMenuItem("�_���f�n");
        menuSave = new JMenuItem("����n��");
        menuSaveAs = new JMenuItem("����n");
        menuClose = new JMenuItem("�P�]");

        fileMenu.add(menuOpen);
        fileMenu.addSeparator(); // �ָ���
        fileMenu.add(menuSave);
        fileMenu.add(menuSaveAs);
        fileMenu.addSeparator(); // �ָ���
        fileMenu.add(menuClose);
    }

    private void initEventListeners() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initAccelerator();

        // ����ҕ���P�]�o�¼�̎��
        addWindowListener(
                new WindowAdapter() {
                    public void windowClosing(WindowEvent event) {
                        closeWindow(event);
                    }
                }
        );

        initMenuListener();

        // ��݋�^�I�P�¼�
        textArea.addKeyListener(
                new KeyAdapter() {
                    public void keyTyped(KeyEvent event) {
                        jtextAreaActionPerformed(event);
                    }
                }
        );

        // ��݋�^�����¼�
        textArea.addMouseListener(
                new MouseAdapter() {
                    public void mouseReleased(MouseEvent event) {
                        if (event.getButton() == MouseEvent.BUTTON3) {
                            popUpMenu.show(editMenu, event.getX(), event.getY());
                        }
                    }

                    public void mouseClicked(MouseEvent e) {
                        if (e.getButton() == MouseEvent.BUTTON1) {
                            popUpMenu.setVisible(false);
                        }
                    }
                }
        );

    }

    private void initMenuListener() {
        menuOpen.addActionListener(this::openFile); // �x�� - �_���f�n
        menuSave.addActionListener(this::saveFile); // �x�� - ����n��
        menuSaveAs.addActionListener(this::saveFileAs); // �x�� - ����n
        menuClose.addActionListener(this::closeFile); // �x�� - �P�]�n��
        menuCut.addActionListener(this::cut); // �x�� - ����
        menuCopy.addActionListener(this::copy); // �x�� - �}�u
        menuPaste.addActionListener(this::paste); // �x�� - �N��
        menuAbout.addActionListener(event -> { // �x�� - �P�
            JOptionPane.showOptionDialog(null, // �@ʾ��Ԓ���K
                    "JNotePad 0.1\n���� http://openhome.cc",
                    "�P�JNotePad",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null, null, null);
        });
    }

    private void initAccelerator() {
        // �����I�O��
        menuOpen.setAccelerator(
                KeyStroke.getKeyStroke(
                        KeyEvent.VK_O,
                        InputEvent.CTRL_MASK));
        menuSave.setAccelerator(
                KeyStroke.getKeyStroke(
                        KeyEvent.VK_S,
                        InputEvent.CTRL_MASK));
        menuClose.setAccelerator(
                KeyStroke.getKeyStroke(
                        KeyEvent.VK_Q,
                        InputEvent.CTRL_MASK));
        menuCut.setAccelerator(
                KeyStroke.getKeyStroke(KeyEvent.VK_X,
                        InputEvent.CTRL_MASK));
        menuCopy.setAccelerator(
                KeyStroke.getKeyStroke(KeyEvent.VK_C,
                        InputEvent.CTRL_MASK));
        menuPaste.setAccelerator(
                KeyStroke.getKeyStroke(KeyEvent.VK_V,
                        InputEvent.CTRL_MASK));
    }

    private void closeWindow(WindowEvent event) {
        closeFile(new ActionEvent(
                event.getSource(), event.getID(), "windowClosing"));
    }

    private void openFile(ActionEvent event) {
        if (stateBar.getText().equals("δ�޸�")) {     // �ļ��Ƿ�郦���B
            showFileDialog();    // �_���f�n
        } else {
            int option = JOptionPane.showConfirmDialog( // �@ʾ��Ԓ���K
                    null, "�n�����޸ģ��Ƿ񃦴棿",
                    "����n����", JOptionPane.YES_NO_OPTION,
                    JOptionPane.WARNING_MESSAGE, null);
            switch (option) {
                case JOptionPane.YES_OPTION: // �_�J�n������
                    saveFile(event); // ����n��
                    break;
                case JOptionPane.NO_OPTION:  // �ŗ��n������
                    showFileDialog();
                    break;
            }
        }
    }

    private void showFileDialog() {
        int option = fileChooser.showDialog(null, null); // �n���xȡ��Ԓ���K

        // ʹ���߰��´_�J�I
        if (option == JFileChooser.APPROVE_OPTION) {
            try {
                setTitle(fileChooser.getSelectedFile().toString());  // �O���ļ����}
                textArea.setText("");          // ���ǰһ���ļ�
                stateBar.setText("δ�޸�");    // �O����B��

                String text = textDAO.read( // �xȡ�n��
                        fileChooser.getSelectedFile().toString());
                textArea.setText(text);         // ���������־�݋�^
            } catch (Throwable e) {
                JOptionPane.showMessageDialog(null, e.toString(),
                        "�_���n��ʧ��", JOptionPane.ERROR_MESSAGE);
            }
        }

    }

    private void saveFile(ActionEvent event) {
        // �Ę��}��ȡ�Ùn�����Q
        Path path = Paths.get(getTitle());
        if (Files.notExists(path)) { // ��ָ���ęn��������
            saveFileAs(event);          // ��������n
        } else {
            try {
                // ����n��
                textDAO.save(path.toString(), textArea.getText());
                // �O����B�О�δ�޸�
                stateBar.setText("δ�޸�");
            } catch (Throwable e) {
                JOptionPane.showMessageDialog(null, e.toString(),
                        "����n��ʧ��", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void saveFileAs(ActionEvent event) {
        // �@ʾ�n����Ԓ���K
        int option = fileChooser.showDialog(null, null);
        // ����_�J�xȡ�n��
        if (option == JFileChooser.APPROVE_OPTION) {
            // �ژ��}�����O���n�����Q
            setTitle(fileChooser.getSelectedFile().toString());
            textDAO.create(   // �����n��
                    fileChooser.getSelectedFile().toString());
            saveFile(event);  // �M�Йn������
        }
    }

    private void closeFile(ActionEvent event) {
        if (stateBar.getText().equals("δ�޸�")) { // �Ƿ��у����ļ�
            dispose();   // ጷ�ҕ���YԴ�������P�]��ʽ
        } else {
            int option = JOptionPane.showConfirmDialog(
                    null, "�n�����޸ģ��Ƿ񃦴棿",
                    "����n����", JOptionPane.YES_NO_OPTION,
                    JOptionPane.WARNING_MESSAGE, null);
            switch (option) {
                case JOptionPane.YES_OPTION:
                    saveFile(event);
                    break;
                case JOptionPane.NO_OPTION:
                    dispose();
            }
        }
    }


    private void cut(ActionEvent event) {
        textArea.cut();
        stateBar.setText("���޸�");
        popUpMenu.setVisible(false);
    }

    private void copy(ActionEvent event) {
        textArea.copy();
        popUpMenu.setVisible(false);
    }

    private void paste(ActionEvent event) {
        textArea.paste();
        stateBar.setText("���޸�");
        popUpMenu.setVisible(false);
    }

    private void jtextAreaActionPerformed(KeyEvent event) {
        stateBar.setText("���޸�");
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            new JNotePad(new FileTextDAO()).setVisible(true);
        });
    }
}

