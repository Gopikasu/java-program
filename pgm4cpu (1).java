class CPU{
	double price;
	class Processor{
		double cores;
		String manufacturer;
		double getCache()
		{
			return 3.40;
		} 
	}
	protected class RAM{
		double memory;
		String manufacurer;
		double getClockSpeed(){
				return 5.2;
			}
		}
	}
public class pgm4cpu{
	public static void main(String[] args){
		CPU cpu=new CPU();
		CPU.Processor processor=cpu.new Processor();
		CPU.RAM ram=cpu.new RAM();
		System.out.println("Processor Cache="+processor.getCache());
		System.out.println("Ram Clock sped="+ram.getClockSpeed());
		}
}

