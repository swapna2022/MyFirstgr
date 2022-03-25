package practice;

public class AwesomeAnimalPojo {

	private int age;
	private int weight;
	private String Type;
	private String Breed;
	private String Name;

	public AwesomeAnimalPojo(String Name, String Type, String Breed, int age, int weight) {
		this.Name = Name;
		this.Breed = Breed;
		this.Type = Type;
		this.age = age;
		this.weight = weight;

	}

	public String getName() {
		return Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getType() {
		return Type;
	}

	public void setType(String Type) {
		this.Type = Type;
	}

	public String getBreed() {
		return Breed;
	}

	public void setBreed(String Breed) {
		this.Breed = Breed;
	}

	public String toString() {
		System.out.println(Name + age + weight + Type + Breed);
		return Name + " " + age + " " + weight + " " + Type + " " + Breed;

	}

}
