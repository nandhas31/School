package school;
import java.util.ArrayList;

public class Cereal {
	//instantiates class variables
	String name;
	int Sugar; 
	public Cereal(String name, int Sugar) {
		//Sets values to the variable
		this.name = name;
		this.Sugar = Sugar;
		
	}
	//getter methods
	public String getName() {
		return name;
	}

	public int getSugar() {
		return Sugar;
	}
	//overrides the default toString method
	@Override
	public String toString() {
		return "This cereal is " + name + " and has " + Sugar + " grams of sugar";
	}
	public static Cereal mostSugar(ArrayList<Cereal> cList) {
		int max = -1;
		int index = -1;
		for (int i = 0; i < cList.size(); i++) {
			if (cList.get(i).getSugar() > max) {
				index = i;
				max = cList.get(i).getSugar();
			}
		}
		return cList.get(index);
			
	}
	
	public static void main(String[] args) {
		//Creates cereal Objects then adds them to list
		ArrayList<Cereal> list = new ArrayList<Cereal>();
		Cereal HundredBran = new Cereal("100% Bran", 6);
		list.add(HundredBran);
		Cereal HundredNaturalBran = new Cereal("100% Natural Bran", 8);
		list.add(HundredNaturalBran);
		Cereal AllBran = new Cereal("All-Bran", 5);
		list.add(AllBran);
		Cereal AllBranWithFiber = new Cereal("All Bran With Extra Fiber", 0);
		list.add(AllBranWithFiber);
		Cereal AlmondDelight = new Cereal("Almond Delight",8);
		list.add(AlmondDelight);
		Cereal AppleCinnamonCheerios= new Cereal("Apple Cinnamon Cheerios",10);
		list.add(AppleCinnamonCheerios);
		Cereal AppleJacks= new Cereal("Apple Jacks",14);
		list.add(AppleJacks);
		Cereal Basic4= new Cereal("Basic 4",8);
		list.add(Basic4);
		Cereal BranChex= new Cereal("Bran Chex",6);
		list.add(BranChex);
		Cereal BranFlakes= new Cereal("Bran Flakes",5);
		list.add(BranFlakes);
		Cereal CapnCrunch= new Cereal("Cap'n'Crunch",12);
		list.add(CapnCrunch);
		Cereal Cheerios= new Cereal("Cheerios",1);
		list.add(Cheerios);
		Cereal CinnamonToastCrunch= new Cereal("Cinnamon Toast Crunch",9);
		list.add(CinnamonToastCrunch);
		Cereal Clusters= new Cereal("Clusters",7);
		list.add(Clusters);
		Cereal CocoaPuffs= new Cereal("Cocoa Puffs",13);
		list.add(CocoaPuffs);
		Cereal CornChex= new Cereal("Corn Chex",3);
		list.add(CornChex);
		Cereal CornFlakes= new Cereal("Corn Flakes",2);
		list.add(CornFlakes);
		Cereal CornPops= new Cereal("Corn Pops",12);
		list.add(CornPops);
		Cereal CountChocula = new Cereal("Count Chocula",13);
		list.add(CountChocula);
		Cereal CracklinOatBran= new Cereal("Cracklin' Oat Bran",7);
		list.add(CracklinOatBran);
		Cereal CreamOfWheat= new Cereal("Cream of Wheat (Quick)",0);
		list.add(CreamOfWheat);
		//prints the cereal with the most sugar
		System.out.println(mostSugar(list));
		}
}
