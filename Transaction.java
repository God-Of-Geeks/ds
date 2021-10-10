import java.io.BufferedReader;  
import java.io.FileReader;  
import java.io.IOException;   
import java.util.*;
public class Transaction { 
	public String tx_hash;	
	public String from_addr;	
	public String to_addr;
	public String block_number;	
	public String token_qty;	
	public String block_time;	
	public String block_hash;	
	public String gas;	
	public String gas_price;	
	public String tx_index_in_block;	
	public String total_gas;
	
	Transaction(String tx_hash,
	String from_addr,
	String to_addr,
	String block_number,	
	String token_qty,
	String block_time,	
	String block_hash,	
	String gas,	
	String gas_price,
	String tx_index_in_block,	
	String total_gas){
		this.tx_hash = tx_hash; 
		this.from_addr = from_addr; 
		this.to_addr = to_addr; 
		this.block_number = block_number;
		this.token_qty = token_qty;
		this.block_time = block_time; 
		this.block_hash = block_hash;
		this.gas = gas;
		this.gas_price = gas_price;
		this.tx_index_in_block = tx_index_in_block;
		this.total_gas = total_gas;

	}
	
	public static void main(String[] args)    
	{  
		//Transaction t = new Transaction();
		String line = "";  
		String splitBy = ",";  
		List<Transaction> tS = new ArrayList<Transaction>();
		try   
		{  
		int count =0;
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\DELL\\Desktop\\MS Sem1\\DS\\Project1\\input_data.csv"));  
		while ((line = br.readLine()) != null)   
		{  
		String[] employee = line.split(splitBy);
		for(String s : employee) {
		System.out.println(s);
		//Transaction t = new Transaction();
		}

		count++;
		System.out.println(count);
		}  
		}   
		catch (IOException e)   
		{  
		e.printStackTrace();  
		}  
		
	}
}
