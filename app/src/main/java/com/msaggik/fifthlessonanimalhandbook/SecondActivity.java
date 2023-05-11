package com.msaggik.fifthlessonanimalhandbook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {

    // создание коллекции контейнера для данных класса Animal
    List<Animal> animals = new ArrayList<Animal>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // инициализируем контейнер
        setInitialData();

        // создадим объект RecyclerView и привяжем к нему соответствующий id
        RecyclerView recyclerView = findViewById(R.id.list_animal);

        // создадим адаптер и загрузим в него контейнер с данными
        AnimalAdapter adapter = new AnimalAdapter(this, animals);

        // на recyclerView подадим адаптер
        recyclerView.setAdapter(adapter);
    }

    // метод setInitialData() устанавливает начальный набор данных (а именно изображения из папки res/drawables)
    private void setInitialData() {
        // добавление в контейнер animals объектов сущности Animal
        animals.add( new Animal("Abarth", "На логотипе итальянской компании, выполненном в форме щита, изображен черный скорпион. Именно под этим знаком родился основатель компании Карл Абарт. ",
                R.drawable.img_5, "1949 "));
        animals.add( new Animal("AC ", "Под данной торговой маркой английские инженеры выпускают спортивные автомобили, отличающиеся высокими динамическими параметрами. Дословно аббревиатура бренда расшифровывается, как Auto Carriers. ",
                R.drawable.img_4, " 1901"));
        animals.add( new Animal("Audi ", "В свободном переводе название легковых автомобилей класса люкс означает «слушай». И, действительно, моторы работают настолько тихо, что услышать их можно, лишь прислушавшись.",
                R.drawable.img, "1909 г"));
        animals.add( new Animal("BMW ", "Это связано с тем, что основным профилем на момент создания концерна был выпуск авиатехники. Сокращение BMW расшифровывается, как «Bayerrische Motoren Werke».",
                R.drawable.img_2, "1916 г"));
        animals.add( new Animal("Bugatti ", "Эксклюзивные автомобили класса люкс украшает овальный логотип красного цвета, в центр которого помещены инициалы и фамилия Этторе Бугатти, основателя предприятия. ",
                R.drawable.img_3, "1909 г"));
    }
}