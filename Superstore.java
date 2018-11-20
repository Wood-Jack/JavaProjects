public class Superstore
{
	public static void main(String[] args)
	{	
		ProductProject product1 = new ProductProject("Nintendo", 300, 50);
		ProductProject product2 = new ProductProject("Xbox", 250, 150);
		ProductProject product3 = new ProductProject("Playstation", 200, 150);
		
		
		// using Dataimport/export to import products
		
		DataImportExport productImportExport = new DataImportExport();
		
		
		System.out.println("Importing Product.txt file");
		ProductProject [] products;
		// importing products file 
		products = productImportExport.importProducts("products.txt");
			//altering prices for the products
			for ( int  i=0 ; i < products.length; i++)
			{
				
				if(products[i] != null)
				{
					products[i].setPrice(products[i].getPrice() *.90);
				}
			}
		
		//Exportin
		productImportExport.exportProducts(products,"ExportProduct.txt");
		
	}
}
