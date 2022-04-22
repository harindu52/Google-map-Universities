package com.assignment.googlemapsuniversities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.assignment.googlemapsuniversities.MapsAdapter.OnClickListener

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val unimap=uniData()
        val recyclerview:RecyclerView=findViewById(R.id.recyclerview)
        recyclerview.layoutManager=LinearLayoutManager(this)
        recyclerview.adapter=MapsAdapter(this, unimap, object:OnClickListener{
            override fun onItemClick(position: Int) {
                val intent = Intent(this@MainActivity, MapsActivity::class.java)
                intent.putExtra("Uni_name",unimap[position])
                startActivity(intent)
            }
        })

        }

    private fun uniData(): List<UniMap> {
        return listOf(
            UniMap(
                "University Of Kelaniya",
                listOf(
                    Place("University Of Kelaniya",6.974291810202281, 79.91569437424626)
                )
            ),
            UniMap(
                "University Of Sri Jayawardanapura",
                listOf(
                    Place("University Of Sri Jayawardanapura",6.853107869942087, 79.90352520299508)
                )
            ),
            UniMap(
                "University Of Moratuwa",
                listOf(
                    Place("University Of Moratuwa", 6.795393931813083, 79.90084553928628)
                )
            ),
            UniMap(
                "University Of Jaffna",
                listOf(
                    Place("University Of Jaffna", 9.685849642733507, 80.02182663291065)
                )
            ),
            UniMap(
                "University Of Colombo",
                listOf(
                    Place("University Of Colombo", 6.900270522070662, 79.85880452579408)
                )
            ),
            UniMap(
                "University Of Peradeniya",
                listOf(
                    Place("University Of Peradeniya", 7.259506630525971, 80.59862941501063)
                )
            )
            ,
            UniMap(
                "University Of Ruhuna",
                listOf(
                    Place("University Of Ruhuna", 5.938294849755356, 80.57611293896441)
                )
            )
            ,
            UniMap(
                "University Of Sabaragamuwa",
                listOf(
                    Place("University Of Sabaragamuwa", 6.714484642684733, 80.78716485245869)
                )
            )
            ,
            UniMap(
                "Eastern University Of Sri Lanka",
                listOf(
                    Place("Eastern University Of Sri Lanka", 7.794549980636313, 81.57894228315078)
                )
            ),
            UniMap(
                "South Eastern University Of Sri Lanka",
                listOf(
                    Place("South Eastern University Of Sri Lanka", 7.297095498060887, 81.8498289487568)
                )
            ),
            UniMap(
                "Rajarata University Of Sri Lanka",
                listOf(
                    Place("Rajarata University Of Sri Lanka", 8.361842831410156, 80.50466492177746)
                )
            ),
            UniMap(
                "Wayamba University Of Sri Lanka",
                listOf(
                    Place("Wayamba University Of Sri Lanka", 7.322747373376586, 79.98817338129685)
                )
            ),
            UniMap(
                "Uva Wellassa University Of Sri Lanka",
                listOf(
                    Place("Uva Wellassa University Of Sri Lanka", 6.9819803891756, 81.07642247150756)
                )
            ),
            UniMap(
                "University Of the Visual & Performing Arts, Sri Lanka",
                listOf(
                    Place("University Of the Visual & Performing Arts, Sri Lanka", 6.91020261, 79.86244297)
                )
            )
        )
    }
}