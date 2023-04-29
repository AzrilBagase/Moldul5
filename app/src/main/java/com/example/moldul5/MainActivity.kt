package com.example.moldul5
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.Data
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.cobarv.Inis_Variable
class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    val Datamahasiswa = listOf<Inis_Variable>(
        Inis_Variable(
            R.drawable. dian,
            namamhs = "Diaan",
            Nimmhs = "0001",
            Telpmhs = "084123"
        ),
        Inis_Variable(
            R.drawable. hfd,
            namamhs = "hfd",
            Nimmhs = "0002",
            Telpmhs = "084123"
        ),
        Inis_Variable(
            R.drawable. dian,
            namamhs = "hfd",
            Nimmhs = "0002",
            Telpmhs = "084123"
        ),
        Inis_Variable(
            R.drawable. hfd,
            namamhs = "hfd",
            Nimmhs = "0002",
            Telpmhs = "084123"
        )
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById<RecyclerView>(R.id.Rv_Mahasiswa)
        recyclerView.setHasFixedSize(true)

        //ShowListMahasiswa()
        //ShowGridMahasiswa()
        ShowCardMahasiswa()
    }

    private fun ShowCardMahasiswa() {
        recyclerView.layoutManager = LinearLayoutManager (this)
        val adapter = Card_MahasiswaAdapter(this, Datamahasiswa) {}
        recyclerView.adapter = adapter
    }

    private fun ShowGridMahasiswa() {
        val adapter = Grid_MahasiswaAdapter(grid_mhs = Datamahasiswa){
        }
        val recyclerView =
            findViewById<RecyclerView>(R.id.Rv_Mahasiswa)
            recyclerView.layoutManager = GridLayoutManager (this, 2)
            recyclerView.adapter = Grid_MahasiswaAdapter (Datamahasiswa) {

            }
    }

    private fun ShowListMahasiswa() {
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter= List_MahasiswaAdaptor(this, Datamahasiswa){
        }
    }
}
