/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg22166017.pbo.lat59;

/**
 *
 * @author User
 * Nama : Silky Afina Saly 
 * NIM : 22166017 
 * Mata Kuliah : Pemrograman Berorientasi Objek 1 
 * Program Studi: Sistem Informasi 
 * Semester : 3
 */
// Kelas Detective Conan Character sebagai super class
public class DetectiveConanCharacter{
// Deklarasi variabel
        private String name;
        private int age;
        private String occupation;
        
// Konstruktor untuk menginisialisasi objek Detective Conan Character
    public DetectiveConanCharacter(String name, int age, String occupation){
        this.name = name;
        this.age = age;
        this.occupation = occupation;

    }
// Metode untuk menampilkan informasi pada kelas Detective Conan Character
    public void Character(){
        System.out.println("Nama : "+name);
        System.out.println("Umur : "+age);
        System.out.println("Pekerjaan : "+occupation);
    }
}
// Sub class conan sebagai turunan dari Detective Conan Character
 class Conan extends DetectiveConanCharacter{
// Deklarasi variabel
        String skill;
        
// Konstruktor        
        public Conan(String name, int age, String occupation, String skill) {
            super(name, age, occupation);
            this.skill= skill;
            
// Metode getter dan setter untuk atribut skill
        }    
        public String getSkill(){
            return skill;
        }
        public void setSkill(String skill){
            this.skill= skill;
        }       
}
// Sub class Ran Mouri sebagai turunan dari Detective Conan Character
class RanMouri extends DetectiveConanCharacter{
    String ability;

// Konstruktor
        public RanMouri(String name, int age, String occupation, String ability) {
            super(name, age, occupation);
            this.ability = ability;
        }
// Metode getter dan setter
        public String getAbility(){
            return ability;
        }
        public void setAbility(String ability){
            this.ability= ability;
        }       
    }

// Sub class Kaito kid sebagai turunan dari Detective Conan Character
class KaitoKid extends DetectiveConanCharacter{
    String role;

// Konstruktor
        public KaitoKid(String name, int age, String occupation, String role) {
            super(name, age, occupation);
            this.role = role;
        }
         public String getRole(){
            return role;
        }
        public void setRole(String role){
            this.role= role;
        }  
        
    public static void main(String[] args) {
       System.out.println("Nama Karakter dalam Serial Detective Conan");
       System.out.println("");
// Membuat obyek conan dan menampilkan output
       Conan conan = new Conan("Detective Conan", 7 ,"Detective", "High school student detective");
       conan.Character();
       System.out.println("Keahlian : "+conan.skill);
       System.out.println("");
 
// Membuat obyek ran mouri dan menampilkan output       
       RanMouri mouri = new RanMouri("Ran Mouri", 17, "High school student", "Karate");
       mouri.Character();
       System.out.println("Kemampuan : "+mouri.ability);
       System.out.println("");

// Membuat obyek kaito kid dan menampilkan output
       KaitoKid kaito = new KaitoKid("Kaito Kid", 17, "Thief", "Antagonist");
       kaito.Character();
        System.out.println("Karakter : "+kaito.role);
    } 
}
