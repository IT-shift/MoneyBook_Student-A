package com.example.demo.form;

import jakarta.validation.constraints.Max; // 課題FM04-1 設問1
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

import lombok.Data;

@Data
public class AnimalForm {

	@NotBlank
	private String animalName;

	@NotBlank(message = "{pet.kind.invalid}")
	private String animalKind;

//	@NotNull(message = "ペットの年齢を入力してください")
	@Min(value = 0, message = "{pet.age.invalid}")
    private int animalAge;

//	@NotNull(message = "飼い始めた年を入力してください")
//	@Min(value = 1900, message = "飼い始めた年は1900年以上で入力してください")
//	@Max(value = 2023, message = "飼い始めた年は2023以下で入力してください")
    @Min(value = 1900, message = "{pet.year.invalid}")
    @Max(value = 2023, message = "{pet.year.invalid}")
    private int animalYear;

//	@NotNull(message = "飼い始めた月を入力してください")
//	@Min(value = 1, message = "飼い始めた月は1以上で入力してください")
//	@Max(value = 12, message = "飼い始めた月は12以下で入力してください")
    @Min(value = 1, message = "{pet.month.invalid}")
    @Max(value = 12, message = "{pet.month.invalid}")
    private int animalMonth;
	
//	@NotNull(message = "飼い始めた日を入力してください")
//	@Min(value = 1, message = "飼い始めた日は1以上で入力してください")
//	@Max(value = 31, message = "飼い始めた日は31以下で入力してください")
    @Min(value = 1, message = "{pet.day.invalid}")
    @Max(value = 31, message = "{pet.day.invalid}")
	private int animalDay;

	
//	private String animalDate;
	
	public void setAnimalName(String animalName) {
		this.animalName = animalName;
	}

	public String getAnimalName() {
		return animalName;
	}

	// 設問3
	public void setAnimalKind(String animalKind) {
        this.animalKind = animalKind;
    }

    public String getAnimalKind() {
        return animalKind;
    }

    public void setAnimalAge(int animalAge) {
        this.animalAge = animalAge;
    }

    public int getAnimalAge() {
        return animalAge;
    }
    //
	
	public void setAnimalYear(int animalYear) {
		this.animalYear = animalYear;
	}

	public int getAnimalYear() {
		return animalYear;
	}

	public void setAnimalMonth(int animalMonth) {
		this.animalMonth = animalMonth;
	}

	public int getAnimalMonth() {
		return animalMonth;
	}

	public void setAnimalDay(int animalDay) {
		this.animalDay = animalDay;
	}

	public int getAnimalDay() {
		return animalDay;
	}

	
	//課題FM03-1_設問4
//	public void setAnimalDate(String animalDate) {
//        this.animalDate = animalDate;
//    }

//    public String getAnimalDate() {
//        return animalDate;
//    }
    //
	
	//課題FM03-2_設問4
	//飼い始めた日付をまとめて文字列として返すメソッド
	
//	public void setAnimalDate(String animalDate) {
//		this.animalDate = animalDate;
//	}
//	
//    public String getAnimalDate() {
//        return animalYear + "年" + animalMonth + "月" + animalDay + "日";
//    }
	
}