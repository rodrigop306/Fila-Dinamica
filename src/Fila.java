import javax.swing.JOptionPane;

public class Fila {
	private No inicio;
	
	public Fila() {
		inicio = null;
	}
	
	public void enfileira(int elem){
		No novo = new No(elem);
		if(inicio==null){
			inicio = novo;
		}else{
			No aux = inicio;
			while(aux.prox!=null){
				aux=aux.prox;
			}
			aux.prox = novo;
		}
	}

	public int desenfileira(){
		int r=-1;
		if(inicio==null){
			JOptionPane.showMessageDialog(null, "ERRO: Lista vazia");
		}else{
			r=inicio.dado;
			inicio=inicio.prox;
		}
		return r;
	}
	@Override
	public String toString(){
		String s="";
		No aux = inicio;
		while(aux!=null){
			s=s+" "+aux.dado;
			aux=aux.prox;
		}
		return s;
	}
}
