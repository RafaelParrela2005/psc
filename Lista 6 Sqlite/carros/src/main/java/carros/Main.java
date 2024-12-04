package carros;

public class Main {

	public static void main(String[] args) {
		 // Criar o DAO para conexão com o banco de dados:
        VeiculoDAO veiculoDAO = new VeiculoDAO();
        
        
      //Criar a tabela veiculo no banco de dados:
        veiculoDAO.createTable();
        
        
        
     // Criar um veiculo:
        Veiculo veiculo = new Veiculo();
        veiculo.setMarca("Ford");
        veiculo.setModelo("SUV");
        veiculo.setChassi("B32221355-25");
        veiculo.setPlaca("MGA-2234");
        veiculo.setCor("Preto");
        
        // Salvar o veiculo no banco de dados:
       veiculo = veiculoDAO.create(veiculo);  
       
       
       // Ler as informações cadastradas no banco de dados:
       veiculoDAO.read(veiculo.getPlaca());
       
       // Atualizar as informações do veiculo:
       veiculo.setCor("Vermelho"); 
       veiculoDAO.update(veiculo); 
       
       // Ler as informações atualizadas no banco de dados:
       veiculoDAO.read(veiculo.getPlaca());
       
    // Remover o veículo:
       veiculoDAO.delete(veiculo);
    
    // Verificar se as informações foram mesmo removidas:
       veiculoDAO.read(veiculo.getPlaca());
       
       
	}

}
