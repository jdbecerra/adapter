/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example_adapter_design_pattern;

/**
 *
 * @author Asus
 */
public class Socket {
    
    public Volt getVolt(){
	return new Volt(120);
    }
}
