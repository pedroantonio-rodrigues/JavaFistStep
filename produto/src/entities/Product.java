package entities;

public class Product {
// atributos da minha classe
	public String name;
	public double price;
	public int quantity;
// metodos que minha classe possui
	// metodo que ve o valor total em estoque 
	public double totalValueInStock() {
		return price * quantity;
	}
	//metodo que adiciona novos produtos 
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	//metodo para remover produtos 
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	// metodo toString que converte meu objeto em string 
	public String toString() {
		return name 
				+ ", $ " 
				//mascara de formatação 
				+ String.format("%.2f", price) 
				+ ", " 
				+ quantity 
				+ " units, Total: $ " 
				+ String.format("%.2f",totalValueInStock());
	}
}
