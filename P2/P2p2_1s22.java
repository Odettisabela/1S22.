public class P2p2_1S22{
public static void main(String[] args) {
  int a;
  for(a=0;a<10;a++){
  	System.out.println("Esta se repite"+a);
  }
  a=0;
  for(;a<10;a+=2){
  	System.out.println("estos son los nuevos valores"+a);
  }
  a=1;
  for(;;a++){
  	if(a>10)break;
  	System.out.println("ahora sin 2 elementos"+a);
  	
  }
  a=1;
  for(;;){
  	System.out.println("Ahora sin parametros");
  	if(a>10)break;
  	a++;
  }
  int b=2,c,cp;
  for(a=2;a<101;a++) {
  	for (c=2;c<=a;c++){
  		if((a%c)==0) cp++;
  	}
  	if (cp==1);
  	System.out.println(" "+a);
  	
  	if(b==10){
  		b=1;
  		System.out.println();
  	}
}
}