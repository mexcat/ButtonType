package cl.gencina.buttontype;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;
import cl.gencina.buttontype.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnFlightMode.setOnClickListener(v -> showMessage("Modo de vuelo desactivado"));
        binding.btnUpdatingProfile.setOnClickListener(v -> showMessage("Actualizando profiles"));
        binding.btnSavePicture.setOnClickListener(v -> showMessage("Imagen guardada"));
        binding.btnUnlockLevel5.setOnClickListener(v -> showMessage("Nivel 5 desbloqueado"));
        binding.btnLvl4Complete.setOnClickListener(v -> showMessage("Nivel 4 completo"));
        binding.btnMusicPaused.setOnClickListener(v -> showMessage("Música pausada"));

    }



    private void showMessage(String mensaje){
        Toast.makeText(getApplicationContext(),mensaje, Toast.LENGTH_LONG).show();
    }
}