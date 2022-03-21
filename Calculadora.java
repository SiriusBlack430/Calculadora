import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculadora extends JFrame{
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    
    private JScrollPane scrollpane;
    private JPanel panel;
    private JTextArea areaNumero;
    private JButton boton0;
    private JButton boton1;
    private JButton boton2;
    private JButton boton3;
    private JButton boton4;
    private JButton boton5;
    private JButton boton6;
    private JButton boton7; 
    private JButton boton8;
    private JButton boton9;
    private JButton botonComa;
    private JButton botonDelete; 
    private JButton botonIgual;
    private JButton botonSuma;
    private JButton botonResta;
    private JButton botonMultiplica;
    private JButton botonDivision;
    private JButton botonModulo;
    private JButton botonBorrar; 

    public static String readLine() throws RuntimeException{
        try{
            return reader.readLine();
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }
    public Calculadora(){ 
    
        setSize(300,400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Calculadora Basica"); 
        componentes();
    }
    private void componentes(){
        panel = new JPanel();   //creacion de panel
        panel.setLayout(null);  // desactivar layout por defecto
        panel.setBackground(Color.DARK_GRAY);   //color del fondo del panel
        getContentPane().add(panel);
        cuadroNumero();
        numeros();
    }
    private void cuadroNumero(){
        areaNumero = new JTextArea(); //creacion cuadro de resultado y operaciones

        areaNumero.setBounds(0,0,300,137);
        areaNumero.setEditable(true);
        areaNumero.setRows(10);
        areaNumero.setColumns(10);
        panel.add(areaNumero);
        
    }
    private void numeros(){
        boton0 = new JButton("0");
        boton1 = new JButton("1");
        boton2 = new JButton("2");
        boton3 = new JButton("3");
        boton4 = new JButton("4");
        boton5 = new JButton("5");
        boton6 = new JButton("6");
        boton7 = new JButton("7");
        boton8 = new JButton("8");
        boton9 = new JButton("9");
        botonComa = new JButton(".");
        botonDelete = new JButton("<--");
        botonIgual = new JButton("=");
        botonSuma = new JButton("+");
        botonResta = new JButton("-");
        botonMultiplica = new JButton("*");
        botonDivision = new JButton("/");
        botonModulo = new JButton("%");
        botonBorrar = new JButton("AC");

        boton0.setBounds(0,317,75,45);
        boton1.setBounds(0,272,75,45);
        boton4.setBounds(0,227,75,45);
        boton7.setBounds(0,182,75,45);
        botonBorrar.setBounds(0,137,150,45);

        botonComa.setBounds(75,317,75,45);
        boton2.setBounds(75,272,75,45);
        boton5.setBounds(75,227,75,45);
        boton8.setBounds(75,182,75,45);

        botonDelete.setBounds(150,317,75,45);
        boton3.setBounds(150,272,75,45);
        boton6.setBounds(150,227,75,45);
        boton9.setBounds(150,182,75,45);
        botonModulo.setBounds(150,137,75,45);

        botonIgual.setBounds(225,317,75,45);
        botonSuma.setBounds(225,272,75,45);
        botonResta.setBounds(225,227,75,45);
        botonMultiplica.setBounds(225,182,75,45);
        botonDivision.setBounds(225,137,75,45);

        boton0.setActionCommand("0");
        boton1.setActionCommand("1");
        boton2.setActionCommand("2");
        boton3.setActionCommand("3");
        boton4.setActionCommand("4");
        boton5.setActionCommand("5");
        boton6.setActionCommand("6");
        boton7.setActionCommand("7");
        boton8.setActionCommand("8");
        boton9.setActionCommand("9");
        botonSuma.setActionCommand("+");
        botonResta.setActionCommand("-");
        botonMultiplica.setActionCommand("*");
        botonDivision.setActionCommand("/");
        botonModulo.setActionCommand("%");
        botonDelete.setActionCommand("Delete");
        botonComa.setActionCommand(".");
        botonBorrar.setActionCommand("AC");
        botonIgual.setActionCommand("=");
       
        panel.add(boton0);
        panel.add(boton1);
        panel.add(boton4);
        panel.add(boton7);
        panel.add(botonBorrar);
        panel.add(botonComa);
        panel.add(boton2);
        panel.add(boton5);
        panel.add(boton8);
        panel.add(botonDelete);
        panel.add(boton3);
        panel.add(boton6);
        panel.add(boton9);
        panel.add(botonModulo);
        panel.add(botonIgual);
        panel.add(botonSuma);
        panel.add(botonResta);
        panel.add(botonMultiplica);
        panel.add(botonDivision);
        
        eventosBoton();
        eventosTeclado();
    }
    private void eventosBoton(){
        
        ActionListener actionEvento = new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent me){
                String name;
                name = me.getActionCommand();
                if (name.equals("0")){
                    areaNumero.append("0");
                }else if(name.equals("1")){
                    areaNumero.append("1");
                }else if(name.equals("2")){
                    areaNumero.append("2");
                }else if(name.equals("3")){
                    areaNumero.append("3");
                }else if(name.equals("4")){
                    areaNumero.append("4");
                }else if(name.equals("5")){
                    areaNumero.append("5");
                }else if(name.equals("6")){
                    areaNumero.append("6");
                }else if(name.equals("7")){
                    areaNumero.append("7");
                }else if(name.equals("8")){
                    areaNumero.append("8");
                }else if(name.equals("9")){
                    areaNumero.append("9");
                }else if(name.equals("+")){
                    areaNumero.append(" + ");
                }else if(name.equals("-")){
                    areaNumero.append(" - ");
                }else if(name.equals("*")){
                    areaNumero.append(" * ");
                }else if(name.equals("/")){
                    areaNumero.append(" / ");
                }else if(name.equals("%")){
                    areaNumero.append(" % ");
                }else if(name.equals(".")){
                    areaNumero.append(".");
                }else if(name.equals("AC")){
                    areaNumero.setText(null);
                }else if(name.equals("Delete")){
                    String borrar = areaNumero.getText();
                    String ultimo = borrar.substring(borrar.length()-1);
                    if (ultimo.equals("")){
                        borrar = borrar.replace("/\n$/","");
                    }else
                        borrar = borrar.replaceFirst(".$","");
                    areaNumero.setText(borrar);
                }else if(name.equals("=")){
                    String opera = operacion();
                    areaNumero.append(" = " + opera + "\n");
                }
            }
        };

        boton0.addActionListener(actionEvento);
        boton1.addActionListener(actionEvento);
        boton2.addActionListener(actionEvento);
        boton3.addActionListener(actionEvento);
        boton4.addActionListener(actionEvento);
        boton5.addActionListener(actionEvento);
        boton6.addActionListener(actionEvento);
        boton7.addActionListener(actionEvento);
        boton8.addActionListener(actionEvento);
        boton9.addActionListener(actionEvento);
        botonSuma.addActionListener(actionEvento);
        botonResta.addActionListener(actionEvento);
        botonMultiplica.addActionListener(actionEvento);
        botonDivision.addActionListener(actionEvento);
        botonModulo.addActionListener(actionEvento);
        botonDelete.addActionListener(actionEvento);
        botonComa.addActionListener(actionEvento);
        botonBorrar.addActionListener(actionEvento);
        botonIgual.addActionListener(actionEvento);
    }
    private void eventosTeclado(){
        
       KeyListener eventoTeclado = new KeyListener(){
            @Override
            public void keyTyped(KeyEvent ke){
                if(ke.getKeyChar()=='.'){
                    areaNumero.append(" ");
                }else if(ke.getKeyChar()=='+'){
                    areaNumero.append(" ");
                }else if(ke.getKeyChar()=='-'){
                    areaNumero.append(" ");
                }else if(ke.getKeyChar()=='*'){
                    areaNumero.append(" ");
                }else if(ke.getKeyChar()=='/'){
                    areaNumero.append(" ");
                }else if(ke.getKeyChar()=='%'){
                    areaNumero.append(" ");
                }else if(ke.getKeyChar()=='='){
                    areaNumero.append(" ");
                }
            }
            @Override 
            public void keyReleased (KeyEvent ke) {
                if(ke.getKeyChar()=='.'){
                    areaNumero.append(" ");
                }else if(ke.getKeyChar()=='+'){
                    areaNumero.append(" ");
                }else if(ke.getKeyChar()=='-'){
                    areaNumero.append(" ");
                }else if(ke.getKeyChar()=='*'){
                    areaNumero.append(" ");
                }else if(ke.getKeyChar()=='/'){
                    areaNumero.append(" ");
                }else if(ke.getKeyChar()=='%'){
                    areaNumero.append(" ");
                }else if(ke.getKeyChar()=='='){
                    areaNumero.append(" "+ operacion()+"\n");
                }
                
            }
            @Override public void keyPressed (KeyEvent ke) {
                if(ke.getKeyCode() == KeyEvent.VK_ENTER){
                    String a = operacion();
                    areaNumero.append(" = "+a);
                }
            }
       };
       areaNumero.addKeyListener(eventoTeclado);
    }
    private String operacion(){
        String [] salto = areaNumero.getText().split("\n");        
        String ultimalinia = salto[salto.length-1];
        String[] linia = ultimalinia.split(" ");
        int operaNum = linia.length/2;
        String sumaDeOperacions="";
        for (int i=0;i<linia.length;i++){
            if (operaNum>0){
                if(linia[i].equals("+")){
                    if (operaNum==(linia.length/2)){
                        sumaDeOperacions = suma(linia[i-1],linia[i+1]);
                        operaNum--;
                    }else{
                        sumaDeOperacions = suma(sumaDeOperacions,linia[i+1]);
                        operaNum--;
                    }
                }else if(linia[i].equals("-")){
                    if (operaNum==(linia.length/2)){
                        sumaDeOperacions = resta(linia[i-1],linia[i+1]);
                        operaNum = operaNum-1;
                    }else{
                        sumaDeOperacions = resta(sumaDeOperacions,linia[i+1]);
                        operaNum--;
                    }
                }else if(linia[i].equals("*")){
                    if (operaNum==(linia.length/2)){
                        sumaDeOperacions = multiplica(linia[i-1],linia[i+1]);
                        operaNum--;
                    }else{
                        sumaDeOperacions = multiplica(sumaDeOperacions,linia[i+1]);
                        operaNum--;
                    }
                }else if(linia[i].equals("/")){
                    if (operaNum==(linia.length/2)){   
                        sumaDeOperacions = divide(linia[i-1],linia[i+1]);
                        operaNum--;
                    }else{
                        sumaDeOperacions = divide(sumaDeOperacions,linia[i+1]);
                        operaNum--;
                    }
                }else if(linia[i].equals("%")){
                    if (operaNum==(linia.length/2)){
                        sumaDeOperacions = modulo(linia[i-1],linia[i+1]);
                        operaNum--;
                    }else{
                        sumaDeOperacions = modulo(sumaDeOperacions,linia[i+1]);
                        operaNum--;
                    }
                }    
            }
        }
        return sumaDeOperacions;       
    }
    private String suma(String numero1,String numero2){
        double num1 = Double.parseDouble(numero1);
        double num2 = Double.parseDouble(numero2);
        double suma = num1 + num2;
        String sumaString = Double.toString(suma);
        return sumaString;     
    }
    private String resta(String numero1,String numero2){
        double num1 = Double.parseDouble(numero1);
        double num2 = Double.parseDouble(numero2);
        double resta = num1 - num2;
        String restaString = Double.toString(resta);

        return restaString;
    }
    private String multiplica(String numero1,String numero2){
        double num1 = Double.parseDouble(numero1);
        double num2 = Double.parseDouble(numero2);
        double mult = num1 * num2;
        String multString = Double.toString(mult);
        return multString;
    }
    private String divide(String numero1,String numero2){
        double num1 = Double.parseDouble(numero1);
        double num2 = Double.parseDouble(numero2);
        double division = num1 / num2;
        String divString = Double.toString(division);
        return divString;
    }
    private String modulo(String numero1,String numero2){
        double num1 = Double.parseDouble(numero1);
        double num2 = Double.parseDouble(numero2);
        double modulo = num1 % num2;
        String modString = Double.toString(modulo);
        return modString;
    }
    public static void main(String[] args){
        Calculadora cal = new Calculadora();
        cal.setVisible(true);
    }
}