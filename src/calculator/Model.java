/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

public class Model {
        private int result;
        public void add(int x , int y)     {  
            result = x+y;           
        }          
        public int getResult(){  
            return result;      
        }   
}
