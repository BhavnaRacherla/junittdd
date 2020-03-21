package com.junittdd;

public class Position {
     public String deleteA(String s) {
    	 int n;
    	 char a[]=s.toCharArray();
    		n=a.length;
    		
    		if(a[0]=='A' && a[1]=='A') {
    			char[] b=new char[n-2];
    	         for(int i=2;i<n;i++){
    	             b[i-2]=a[i];
    	         }
    	         String string =new String(b);
    	    		return string;
    		}
    		else if(a[0]=='A') {
    			char[] b=new char[n-1];
    			for(int i=1;i<n;i++) {
    				b[i-1]=a[i];
    			}
    			String string =new String(b);
        		return string;
    		}
    		else if(a[1]=='A') {
    			char[] b=new char[n-1];
    		    b[0]=a[0];
    			for(int i=2;i<n;i++) {
    				b[i-1]=a[i];
    			}
    			String string =new String(b);
        		return string;
    		}
    		else{
    			char[] b=new char[n];
    		    b=a;
    		    String string =new String(b);
        		return string;
    		}
			
     }
    
}
