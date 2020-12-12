package com.example.thecoffeehouse.tablayout;

import android.animation.PropertyValuesHolder;
import android.app.Dialog;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import com.example.thecoffeehouse.R;
import com.example.thecoffeehouse.bottomNavigation.Dathang;
import com.example.thecoffeehouse.model_adapter.DoUong;
import com.example.thecoffeehouse.model_adapter.SanPhamAdapter;

public class PhoBienFragment extends Fragment {

    private GridView gvmon;
    private SanPhamAdapter spadt;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View r = inflater.inflate(R.layout.fragment_pho_bien, container, false);
        gvmon = r.findViewById(R.id.gv_mon);
        spadt = new SanPhamAdapter(PhoBienFragment.this.getActivity(), R.layout.item);
        gvmon.setAdapter(spadt);
        registerForContextMenu(gvmon);
        fakeData();
        addEvents();
        return r;
    }

    private void fakeData() {
        spadt.add(new DoUong(R.drawable.capheluamach, "Cà phê Lúa mạch đá", "69.000"));
        spadt.add(new DoUong(R.drawable.capheluamachnong, "Cà phê Lúa mạch nóng", "69.000"));
        spadt.add(new DoUong(R.drawable.luamachdaxay, "Sôcôla Lúa mạch đá xay", "69.000"));
        spadt.add(new DoUong(R.drawable.luamachnong, "Sôcôla Lúa mạch nóng", "69.000"));
        spadt.add(new DoUong(R.drawable.macca, "Macca phủ sôcôla", "45.000"));
        spadt.add(new DoUong(R.drawable.caphesua, "Cà phê sữa đá", "32.000"));
        spadt.add(new DoUong(R.drawable.tradao, "Trà đào", "20.000"));
        spadt.add(new DoUong(R.drawable.kemdau, "Kem dâu tươi", "15.000"));

    }

    private void addEvents() {
        gvmon.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {

                Dialog dialog = new Dialog(PhoBienFragment.this.getActivity());
                dialog.setContentView(R.layout.dilg_dathang);
                dialog.show();
            }
        });
        gvmon.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                Dialog dialog = new Dialog(PhoBienFragment.this.getActivity());
                dialog.setContentView(R.layout.dhang);
                dialog.show();

                return true;
            }
        });
    }
}