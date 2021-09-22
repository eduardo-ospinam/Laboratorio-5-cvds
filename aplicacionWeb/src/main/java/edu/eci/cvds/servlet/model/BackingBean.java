   
package edu.eci.cvds.servlet.model;

import javax.faces.bean.SessionScoped;
import javax.faces.bean.ManagedBean;
import java.util.ArrayList;
import java.util.Random;

@ManagedBean(name = "calculadoraBean")
@ApplicationScoped
 
public class BackingBean {
	
	private ArrayList<Integer> listadoValores;
	private double promedio;
	private double desviacionEstandar;
	private double varianza;
	private double moda;
	
	public BackingBean() {}
	
    public void restart(){
    	listadoValores.clear();
    	promedio = 0;
    	desviacionEstandar = 0;
    	varianza = 0;
    	moda = 0;
    }
    
    public double getPromedio(){
    	return this.promedio;
    }
    
    public double getDesviacionEstandar(){
    	return this.desviacionEstandar;
    }
    
    public double getVarianza(){
    	return this.varianza;
    }
    
    public double getModa() {
    	return this.moda;
    }
    
    public void setPromedio(int promedio) {
    	this.promedio = promedio;
    }
    
    public void setDesviacionEstandar(double desviacionEstandar) {
    	this.desviacionEstandar = desviacionEstandar;
    }
    
    public void setVarianza(double varianza) {
    	this.varianza = varianza;
    }
    
    public void setModa(double moda) {
    	this.moda = moda;
    }
    
    public void calculateMean(ArrayList<Integer> listadoValores) {
    	double suma;
    	for(int i= 0; i < listadoValores.size() ; i++) {
    		suma += listadoValores.get(i);
    	}
    	suma = suma/listadoValores.size();
    	setPromedio(suma);
    }
    
    private double promedioalCuadrado(ArrayList<Integer> listadoValores) {
    	double suma;
    	for(int i= 0; i < listadoValores.size() ; i++) {
    		suma += Math.pow(listadoValores.get(i), 2); 
    	}
    	suma = suma/listadoValores.size(); 
    	return suma;
    }
    
    public void calculateStandardDeviation(ArrayList<Integer> listadoValores) {
    	calculateVariance(listadoValores);
    	setDesviacionEstandar(Math.sqrt(getVarianza()));
    }
    
    public void calculateVariance(ArrayList<Integer> listadoValores) {
    	calculateMean(listadoValores);
    	double miu = Math.pow(getPromedio(), 2); 
    	double promedioDos = promedioalCuadrado(listadoValores);
    	setVarianza(promedioDos - miu);
    }
    
    public void calculateMode(ArrayList<Integer> listadoValores) {
        int maxValue, maxCount;

        for (int i = 0; i <listadoValores .size(); ++i) {
            int count = 0;
            for (int j = 0; j < listadoValores .size(); ++j) {
                if (listadoValores.get(j) == listadoValores.get(i)) ++count;
            }
            if (count > maxCount) {
                maxCount = count;
                maxValue =  listadoValores.get(i);
            }
        }
        
        setModa(maxValue);
    }
}
