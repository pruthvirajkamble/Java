import java.util.Scanner;
class VotingSystem 
{
	static int bjp, con, ss, mns, aap, nota;
	public static void main(String[] args) 
		
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Population : ");
		int pop  = sc.nextInt();
		for(int i=1;i<=pop;i++){
			System.out.print("");
			System.out.println("*** Welcome ***");
			System.out.print("");
			System.out.println("1.Bjp  2.Cong 3.ss  4.mns  5.app  6.nota");
			System.out.print("");
			System.out.print("Enter an option : ");
			int option = sc.nextInt();
			switch(option){
				case 1: System.out.println("Sabka sath sabka vikas: ");bjp++;break;
				case 2: System.out.println("bharat jodo ");con++;break;
				case 3: System.out.println("Hum hai asli shiv sena.  ");ss++;break;
				case 4: System.out.println("jai maharastra.  ");mns++;break;
				case 5: System.out.println("Apka ek vote hume jail se bahar nikal sakta hai. ");aap++;break;
				case 6: System.out.println("Your are EDucated. ");nota++;break;
				default: System.out.println("Really you entered this options. "); break;
			}
		}
		//bjp, con, ss, mns, aap, nota

        if(bjp>con && bjp>ss && bjp>mns && bjp>aap && bjp>nota)
        	System.out.println("BJP has won this election by " + bjp+ " votes."); 
        else if(bjp<con && con>ss && con>mns && con>aap && con >nota)
        	System.out.println("CONGRESS has won this election by" + con + "votes"); 
        else if(bjp<ss && con<ss && ss>mns && ss>aap && ss>nota)
            System.out.println("SHIV SENA has won this election by"+ ss +" votes.");
        else if(bjp<mns && mns>ss && con<mns && mns >aap && mns> nota) 
        	System.out.println("MNS has won this election by" + mns + " votes.");
        else if(bjp<aap && aap>ss && aap>mns && aap> con && aap> nota)
        	System.out.println("AAP has won this election by"+ aap +" votes.");
        else
        	System.out.println("You have " + nota +" votes for NOTA");
        	}
}
