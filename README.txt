hardhack.jar er et program der skriver alle 10k kombinationer fra mest populære til mindst populære.
Den åbner også et vindue så man kan lukke programmet igen. det tager ca 100 sekunder for programmet og køre færdigt.

den rå kode er givet i: HardHack.java

jeg ved ikke om det er effektivt smart eller godt. det var bare et lille pojekt for sjov

result.txt er de forskellige tal i rigtig rækkefølge

1234
1111
0000
1212 osv.



man kan skifte koden så den kun skal parseint en gang :P
 int temp = Integer.parseInt(i);
  if(temp==0){r.keyPress(KeyEvent.VK_0); };
  if(temp==1){r.keyPress(KeyEvent.VK_1); };
  osv.                  
