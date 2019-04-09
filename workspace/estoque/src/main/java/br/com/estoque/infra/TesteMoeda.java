package br.com.estoque.infra;



public class TesteMoeda {

	public static void main(String[] args) {
		
		String valor = "25.998,98";
		valor = valor.replace(".","");
        valor = valor.replace(",",".");
        //valor = parseFloat(valor);
        Double a = new Double(valor);
        System.out.println(a.doubleValue());
	}

}
