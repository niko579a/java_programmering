public class BinarySorting{
  public static void main(String[] args){
    int[] talArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int talHolder = 3; //Variable der bestemmer hvilket tal der skal søges efter.
    int indexHolder = -1; //Variable der fortæller tallets index. Sætter den til -1 så den "ikke har en værdi".
//rangeMax og minimum så den kun kigger på tallene i arrayen som tallet vi leder efter kan være.
    int rangeMinimum = 0;
    int rangeMax = talArray.length - 1;
    int rangeMidte = talArray.length/2; //Variable der sørge for at algoritmen hele tiden kigger i midten (af max og minimum).
    int loopEnd = 0;

    while(indexHolder == -1 && loopEnd == 0){ //while loopet sørge for at så længe indexet ikke er fundet og loopet ikke er kørt igennem arrayen, så gør den følgende kode:
      if(talArray[rangeMidte] == talHolder){
        indexHolder = rangeMidte;
        break; //if statementet gør at hvis pladsen i arrayen svarer til tallet der søges efter skal den stoppe med at lede.
      }else{
        if(talArray[rangeMidte] < talHolder){
          rangeMinimum = rangeMidte; //ellers hvis tallet der søges efter er større end midtertallet rykkes minimumet op til midtertallet.
        }else{
          rangeMax = rangeMidte; //ellers hvis det er mindre skal den rykke rangeMax ned til midtertallet.
        }
      }
      rangeMidte = (rangeMinimum + rangeMax)/2; //udregner den nye midter index.
      if(rangeMinimum == 0 && rangeMax == 0 || rangeMinimum == 8 && rangeMax == 9){
        loopEnd++;
      } //if statementet gør at hvis minimum og max rangen er 0 eller hvis den er 8 og 9 skal den stoppe med at søge.
    }
    if(indexHolder > -1){
      System.out.println("index: " + indexHolder); //if statementet gør at hvis indexholder har en værdi skal den printe dens værdi.
    }else{ //ellers skal den skrive at tallet ikke er fundet. 
      System.out.println("Tal ikke fundet!");
    }
  }
}
