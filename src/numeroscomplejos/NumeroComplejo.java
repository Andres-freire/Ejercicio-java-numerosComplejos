package numeroscomplejos;
public class NumeroComplejo {
    private int parteReal;
    private int parteImaginaria;
    
    // Método para cargar valores a los atributos real e img
    public void cargar(String numeroComplejo){
        String[] partes= numeroComplejo.split("[-+i]");
        this.parteReal=Integer.parseInt(partes[0]);
        if(numeroComplejo.contains("-")){  //Contains busca donde se encuentra un menos en la cadena 
            this.parteImaginaria= -1*Integer.parseInt(partes[1]);
        } else {
            this.parteImaginaria =  Integer.parseInt(partes[1]);
        }
    }
    
    // Método para mostrar el número complejo
    public String mostrar() {
        if(this.parteImaginaria >= 0){
            return this.parteReal + "+" + this.parteImaginaria + "i";
        } else {
            return this.parteReal + "" + this.parteImaginaria + "i";
        }
    }
    
    //Suma los dos numeros C
    public String suma(NumeroComplejo otroNumero) {
    int sumaReal = this.parteReal + otroNumero.parteReal;
    int sumaImg = this.parteImaginaria + otroNumero.parteImaginaria;
    if(sumaImg >= 0){
        return sumaReal + "+" + sumaImg + "i";
    } else{
        return sumaReal + "" + sumaImg + "i";
    }   
    }
}