Proceso Promedio
	
definir examen como real;
definir suma_calf como real;
definir promediar como real;
Definir i como entero;
suma_calf<-0;


	Para i<-1 Hasta 4 Con Paso 1 Hacer
		Escribir "Dame la calificacion de tu examen ",i;
		
		leer examen;
		
		suma_calf<- suma_calf+examen;
	FinPara
	
	promediar<- suma_calf/4;
		EScribir "Promedio final es: ", promediar;
	
FinProceso



