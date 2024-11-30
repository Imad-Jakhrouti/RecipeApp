package ma.ump.eniad.recipeapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        Button ajouter_recette = findViewById(R.id.ajouter_recette);
        Button consulter_recettes = findViewById(R.id.consulter_recettes);

        ajouter_recette.setOnClickListener(view -> {
            startActivity(new Intent(getApplicationContext(), AddRecipeActivity.class));
        });

        consulter_recettes.setOnClickListener(view -> {
            startActivity(new Intent(getApplicationContext(), ViewRecipesActivity.class));
        });











        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}