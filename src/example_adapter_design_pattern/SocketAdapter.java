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
public interface SocketAdapter {
    public Volt get120Volt();
		
    public Volt get12Volt();
	
    public Volt get3Volt();
}
