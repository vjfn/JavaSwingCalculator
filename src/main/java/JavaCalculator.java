import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JavaCalculator {
    private JPanel JavaCalculator;
    private JTextField txtResultado;
    private JButton b2Button;
    private JButton btnClear;
    private JButton btnSiete;
    private JButton btnCuatro;
    private JButton btnUno;
    private JButton btnDividir;
    private JButton btnNueve;
    private JButton btnSeis;
    private JButton btnTres;
    private JButton b1Button;
    private JButton btnOcho;
    private JButton btnMultiplicar;
    private JButton btnCinco;
    private JButton btnRestar;
    private JButton btnDos;
    private JButton btnSumar;
    private JButton btnInvertir;
    private JButton btnCero;
    private JButton btnPunto;
    private JButton btnIgual;

    private Double total1 = 0.0;
    private Double total2 = 0.0;

    public JavaCalculator() {

        btnUno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnUnoText = txtResultado.getText()+btnUno.getText();
                txtResultado.setText(btnUnoText);
            }
        });
        btnDos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnDosText = txtResultado.getText()+btnDos.getText();
                txtResultado.setText(btnDosText);
            }
        });
        btnTres.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnTresText = txtResultado.getText()+btnTres.getText();
                txtResultado.setText(btnTresText);
            }
        });
        btnCuatro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnCuatroText = txtResultado.getText()+btnCuatro.getText();
                txtResultado.setText(btnCuatroText);
            }
        });
        btnCinco.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnCincoText = txtResultado.getText()+btnCinco.getText();
                txtResultado.setText(btnCincoText);
            }
        });
        btnSeis.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnSeisText = txtResultado.getText()+btnSeis.getText();
                txtResultado.setText(btnSeisText);
            }
        });
        btnSiete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnSieteText = txtResultado.getText()+btnSiete.getText();
                txtResultado.setText(btnSieteText);
            }
        });
        btnOcho.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnOchoText = txtResultado.getText()+btnOcho.getText();
                txtResultado.setText(btnOchoText);
            }
        });
        btnNueve.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnNueveText = txtResultado.getText()+btnNueve.getText();
                txtResultado.setText(btnNueveText);
            }
        });
        btnCero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnCeroText = txtResultado.getText()+btnCero.getText();
                txtResultado.setText(btnCeroText);
            }
        });
        btnPunto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(txtResultado.getText().equals("")){
                    txtResultado.setText("0.");
                } else if (txtResultado.getText().contains(".")) {
                    btnPunto.setEnabled(false);
                }else{
                    String btnPuntoText = txtResultado.getText() + btnPunto.getText();
                    txtResultado.setText(btnPuntoText);
                }
                btnPunto.setEnabled(true);

            }
        });
        btnSumar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total1 = total1 + Double.parseDouble(txtResultado.getText());
                txtResultado.setText("");
            }
        });
        btnIgual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total2 = total1 + Double.parseDouble(txtResultado.getText());
                txtResultado.setText(Double.toString(total2));
                total1 = 0.0;
            }
        });
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total2 = 0.0;
                txtResultado.setText("");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("JavaCalculator");
        frame.setContentPane(new JavaCalculator().JavaCalculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
