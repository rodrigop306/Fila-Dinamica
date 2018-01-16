import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		int opc=0;
		Fila f = new Fila();
		int elem=0;
		while(opc!=4){
			opc=Integer.parseInt(JOptionPane.showInputDialog("1-Enfileirar \n"
					+ "2-Desenfileirar \n"
					+ "3-Mostrar Fila \n"
					+ "4-Sair"));
			switch(opc){
			case 1:
				elem = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero: "));
				f.enfileira(elem);
				break;
			case 2:
				JOptionPane.showMessageDialog(null, "O numero removido é: "+f.desenfileira());
				break;
			case 3:
				JOptionPane.showMessageDialog(null,f.toString());
				break;
			case 4:
				System.exit(0);
				break;
			default:
				break;
			}
		}

	}

}
