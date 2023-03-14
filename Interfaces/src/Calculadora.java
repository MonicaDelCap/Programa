import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author monic on 09/03/2023.
 * @project Interfaces
 */
public class Calculadora extends JFrame {

    private JPanel panelSuperior=new JPanel();
    private JPanel panelInferior=new JPanel();
    private JButton [] botones = new JButton[16];
    private JTextField ventana= new JTextField(5);

    private JButton boton0=new JButton("0");
    private JButton boton1=new JButton("1");
    private JButton boton2=new JButton("2");
    private JButton boton3=new JButton("3");
    private JButton boton4=new JButton("4");
    private JButton boton5=new JButton("5");
    private JButton boton6=new JButton("6");
    private JButton boton7=new JButton("7");
    private JButton boton8=new JButton("8");
    private JButton boton9=new JButton("9");
    private JButton botonSuma=new JButton("+");
    private JButton botonResta=new JButton("-");
    private JButton botonMultiplicador=new JButton("x");
    private JButton botonDivisor=new JButton("/");
    private JButton botonIgual=new JButton("=");
    private JButton botonComa=new JButton(",");

    private JButton borrarPanel= new JButton("CE");

    int posicion1=0;

    int posicion2=0;
    String simbolo="";


    Calculadora(){



        this.setSize(300,500);

        panelSuperior.setLayout(new FlowLayout());
        panelSuperior.add(ventana);



        panelInferior.setLayout(new GridLayout(4,4,10,10));


/*
        botones[0] = new JButton("1");
        botones[1]= new JButton("2");
        botones[2]= new JButton("3");
        botones[3]= new JButton("4");
        botones[4]= new JButton("5");
        botones[5]= new JButton("6");
        botones[6]= new JButton("7");
        botones[7]= new JButton("8");
        botones[8]= new JButton("9");
        botones[9]= new JButton("+");
        botones[10]= new JButton("-");
        botones[11]= new JButton("%");
        botones[12]= new JButton("x");
        botones[13]= new JButton("=");
        botones[14]=new JButton("0");
        botones[15]=new JButton(",");*/

            panelInferior.add(boton1);
            panelInferior.add(boton2);
            panelInferior.add(boton3);
            panelInferior.add(botonSuma);

           panelInferior.add(boton4);
           panelInferior.add(boton5);
           panelInferior.add(boton6);
           panelInferior.add(botonResta);

           panelInferior.add(boton7);
           panelInferior.add(boton8);
           panelInferior.add(boton9);
           panelInferior.add(botonDivisor);

           panelInferior.add(borrarPanel);
           panelInferior.add(boton0);
           panelInferior.add(botonIgual);
           panelInferior.add(botonMultiplicador);




           //Implementacion de botones para q aparezcan en pantalla
           boton0.addActionListener(new ActionListener() {
               @Override
               public void actionPerformed(ActionEvent e) {
                   ventana.setText(ventana.getText()+boton0.getText());
               }
           });

           boton1.addActionListener(new ActionListener() {
               @Override
               public void actionPerformed(ActionEvent e) {
                   ventana.setText(ventana.getText()+boton1.getText());
               }
           });

           boton2.addActionListener(new ActionListener() {
               @Override
               public void actionPerformed(ActionEvent e) {
                   ventana.setText(ventana.getText()+boton2.getText());
               }
           });

        boton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ventana.setText(ventana.getText()+boton3.getText());
            }
        });
        boton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ventana.setText(ventana.getText()+boton4.getText());
            }
        });
        boton5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ventana.setText(ventana.getText()+boton5.getText());
            }
        });
        boton6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ventana.setText(ventana.getText()+boton6.getText());
            }
        });

        boton7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ventana.setText(ventana.getText()+boton7.getText());
            }
        });
        boton8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ventana.setText(ventana.getText()+boton8.getText());
            }
        });
        boton9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ventana.setText(ventana.getText()+boton9.getText());
            }
        });

        botonSuma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                posicion1=Integer.parseInt(ventana.getText());

                ventana.setText("");

                simbolo="+";
            }
        });
        botonResta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                posicion1=Integer.parseInt(ventana.getText());
                ventana.setText("");
                simbolo="-";
            }
        });
        botonMultiplicador.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                posicion1=Integer.parseInt(ventana.getText());
                ventana.setText("");
                simbolo="x";
            }
        });
        botonDivisor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                posicion1=Integer.parseInt(ventana.getText());
                ventana.setText("");
                simbolo="/";
            }
        });



        botonIgual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                posicion2=Integer.parseInt(ventana.getText());

                switch (simbolo){
                    case "+":
                        String suma=posicion1+posicion2+"";
                        ventana.setText(suma);
                        posicion1=Integer.parseInt(suma);
                        break;
                    case "-":
                        String resta=posicion1-posicion2+"";
                        ventana.setText(resta);
                        posicion1=Integer.parseInt(resta);

                        break;
                    case "/":
                        String division=posicion1/posicion2+"";
                        ventana.setText(division);
                        posicion1=Integer.parseInt(division);

                        break;
                    case "x":
                        String multiplica= posicion1*posicion2+"";
                        ventana.setText(multiplica);
                        posicion1=Integer.parseInt(multiplica);

                        break;

                }

            }
        });

        borrarPanel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ventana.setText("");
                posicion1=0;
                simbolo="";
                posicion2=0;
            }
        });
        this.setLayout(new BoxLayout(this.getContentPane(),BoxLayout.Y_AXIS));
        this.add(panelSuperior);
        this.add(panelInferior);
        this.setVisible(true);
        this.pack();



    }


    class botonOyente implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {


        }
    }



    public JPanel getPanelSuperior() {
        return panelSuperior;
    }

    public void setPanelSuperior(JPanel panelSuperior) {
        this.panelSuperior = panelSuperior;
    }

    public JPanel getPanelInferior() {
        return panelInferior;
    }

    public void setPanelInferior(JPanel panelInferior) {
        this.panelInferior = panelInferior;
    }

    public JButton[] getBotones() {
        return botones;
    }

    public void setBotones(JButton[] botones) {
        this.botones = botones;
    }

    public JTextField getVentana() {
        return ventana;
    }

    public void setVentana(JTextField ventana) {
        this.ventana = ventana;
    }

    public void sumar (int primero, int segundo ){

    }

    public void restar(int primero,int segundo){

    }

    public void dividir(int primero,int segundo){

    }
    public void multiplicar (int primero,int segundo ){

    }

}
