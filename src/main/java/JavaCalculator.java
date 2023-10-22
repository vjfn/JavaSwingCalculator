import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.lang.Math.sqrt;
/**
 * JavaCalculator es una aplicación que permite realizar operaciones
 * aritméticas básicas, así como funciones adicionales como la raíz cuadrada,
 * potenciación e inversión de números.
 */
public class JavaCalculator extends JFrame {
    // Componentes de la calculadora
    private JPanel JavaCalculator;
    private JLabel txtResultado;
    private JButton btnPotencia;
    private JButton btnClear;
    private JButton btnSiete;
    private JButton btnCuatro;
    private JButton btnUno;
    private JButton btnDividir;
    private JButton btnNueve;
    private JButton btnSeis;
    private JButton btnTres;
    private JButton btnRaiz;
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
    // Variables para realizar cálculos
    private Double total1 = 0.0;
    private Double total2 = 0.0;
    private char operador;

    public JavaCalculator() {
        // Configuración de los botones
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
        /**
         * Método para realizar operaciones matemáticas (suma, resta, multiplicación, división, raiz, potencia e
         * inversión) así como el boton igual y limpiar calculadora
         */
        btnIgual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (operador) {
                    case'+':
                        total2 = total1 + Double.parseDouble(txtResultado.getText());
                        break;
                    case'-':
                        total2 = total1 - Double.parseDouble(txtResultado.getText());
                        break;
                    case'/':
                        total2 = total1 / Double.parseDouble(txtResultado.getText());
                        break;
                    case'*':
                        total2 = total1 * Double.parseDouble(txtResultado.getText());
                        break;
                }
                txtResultado.setText(Double.toString(total2));
                total1=0.0;
            }
        });
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total2 = 0.0;
                txtResultado.setText("");
            }
        });


        btnSumar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnText = btnSumar.getText();
                getOperacion(btnText);
            }
        });
        btnRestar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnText = btnRestar.getText();
                getOperacion(btnText);
            }
        });
        btnMultiplicar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnText = btnMultiplicar.getText();
                getOperacion(btnText);
            }
        });
        btnDividir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnText = btnDividir.getText();
                getOperacion(btnText);
            }
        });

        btnRaiz.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(txtResultado!=null && txtResultado.getText().length() != 0) {
                    total2 = sqrt(Double.parseDouble((txtResultado.getText())));
                    txtResultado.setText(String.valueOf(total2));
                }
            }
        });

        btnPotencia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(txtResultado!=null && txtResultado.getText().length() != 0) {
                    total2 = (Double.parseDouble((txtResultado.getText()))) * (Double.parseDouble((txtResultado.getText())));
                    txtResultado.setText(String.valueOf(total2));
                }
            }
        });

        btnInvertir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(txtResultado!=null && txtResultado.getText().length() != 0) {
                    total2 = (-1) * (Double.parseDouble((txtResultado.getText())));
                    txtResultado.setText(String.valueOf(total2));
                }
            }
        });
    }
    private void getOperacion(String btnText) {
        if(txtResultado!=null && txtResultado.getText().length() != 0) {
            operador = btnText.charAt(0);
            total1 = total1 + Double.parseDouble(txtResultado.getText());
            txtResultado.setText("");
        }
    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculadora");
        frame.setContentPane(new JavaCalculator().JavaCalculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setResizable(false);
    }
}
