package masivianrefactortest.printer;

import java.util.List;

public class ConsolePrinter {
    
    public static void consolePrint(List<Integer> primeNumbers, int rowsBypage, int columnsByPage){
	int PAGEOFFSET = 0;
        int primeListSize = primeNumbers.size() - 1;
        int pages = (int)(primeListSize/(rowsBypage*columnsByPage)) + (primeListSize%(rowsBypage*columnsByPage)>0?1:0);
        for(int page = 1; page<=pages; page++) {   
            System.out.format("The First %d Prime Numbers === Page %d %n", primeListSize, page); 
            for (int ROWOFFSET=PAGEOFFSET; ROWOFFSET <= PAGEOFFSET+rowsBypage-1; ROWOFFSET++) {
		for (int Column = 0; Column <= columnsByPage - 1; Column++){
                    if (ROWOFFSET + Column * rowsBypage <= primeListSize)
			System.out.printf("%10d", primeNumbers.get(ROWOFFSET + Column * rowsBypage));
                }
                System.out.format("%n");
            }
            System.out.println("\f");
            PAGEOFFSET += rowsBypage*columnsByPage;
	}  
    }
    
}
