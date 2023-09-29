import java.util.*;
class PSet<T>{
	ArrayList<T> al;
	PSet(){
	 al=new ArrayList<>();	
	}
	public boolean add(T e){
		if(al==null) {
			al.add(e);
			return true;
		}
		if(al.contains(e)) return false;
		al.add(e);
		return true;
	}
	public String toString(){
		if(al==null) return "[]";
		String s1="";
		System.out.print("[");
		for(int i=0;i<al.size();i++){
			System.out.print(al.get(i));
			if(i+1!=al.size()) System.out.print(",");
		}
		s1+="]";
		return s1;
	}
}
class De{
	public static void main(String ar[]){
		PSet p=new PSet();
		p.add(10);
		p.add(11);
		p.add(11);
		p.add(null);
		p.add(null);
		p.add("ram");
		System.out.print(p);
	}
}
// uplers
// justRemote
// Remote.com
// leads.io
// weworkremotely
// ............
// zenjob
// grabjobs
