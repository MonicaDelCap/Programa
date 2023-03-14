import javax.swing.*;
import java.awt.*;

/**
 * @author monic on 09/03/2023.
 * @project Interfaces
 */
public class VentanaGroupLayout extends Frame {


        public VentanaGroupLayout() {
            super("GroupLayout");
            setSize( 300, 150 );
            GroupLayout contenedor = new GroupLayout(this);
            setLayout(contenedor);

            contenedor.setAutoCreateGaps(true);
            contenedor.setAutoCreateContainerGaps(true);
            Button botones [] = new Button[9];
            botones[0]=new Button("1");
            botones[1]=new Button("2");
            botones[2]=new Button("3");
            botones[3]=new Button("4");
            botones[4]=new Button("5");
            botones[5]=new Button("6");
            botones[6]=new Button("7");

            contenedor.setHorizontalGroup(
                    contenedor.createSequentialGroup()
                            .addComponent(botones[0]) //C1
                            .addComponent(botones[1]) //C2
                            .addGroup(contenedor.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(botones[2])
                                    .addComponent(botones[5]))//C4
                            .addComponent(botones[3])

            );
            contenedor.setVerticalGroup(
                    contenedor.createSequentialGroup()
                            .addGroup(contenedor.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(botones[0]) //C1
                                    .addComponent(botones[1])
                                    .addComponent(botones[2])) //C2
                            .addComponent(botones[3])
                            .addComponent(botones[5])//C4

            );
            /*
            contenedor.setHorizontalGroup(
                    contenedor.createSequentialGroup()
                            .addComponent(botones[3])
                            .addComponent(botones[4])
                            .addGroup(contenedor.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(botones[5]))
            );
            contenedor.setVerticalGroup(
                    contenedor.createSequentialGroup()
                            .addGroup(contenedor.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(botones[3])
                                    .addComponent(botones[4]))
                            .addComponent(botones[5])
            );

             */

            setVisible(true);
        }

    }


