
public class TesteConexao {

	public static void main(String[] args) {
			
		try(Conexao conexao = new Conexao()){
			conexao.leDados();
			//conexao.fecha();
			
		}catch(IllegalStateException ex) {
			System.out.println("Deu erro na conex�o");
		}finally {
			
		}
		
	}}	
		
		
		
		
		
		
		
//		
//		Conexao con = null;
//			try {
//				con = new Conexao();
//				con.leDados();
//				
//			}catch(IllegalStateException ex) {
//				System.out.println("Deu erro na conex�o");
//				
//			}finally {
//				con.fecha();
//			}
//
//	}
//
//}
