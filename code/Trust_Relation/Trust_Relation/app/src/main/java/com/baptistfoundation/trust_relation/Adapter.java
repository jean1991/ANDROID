/*package com.baptistfoundation.trust_relation;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import static com.baptistfoundation.trust_relation.R.id.spinner1;

/**
 * Created by Hp on 8/1/2015.
 */
/*
public class Adapter extends BaseAdapter {
    private Context mContext;
    private ArrayList<userModel> listItems;

    public Adapter (Context context, ArrayList<userModel> items) {
        this.mContext = context;
        this.listItems = items;

    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        View view = convertView;
        if (view == null) {
            view = LayoutInflater.from(mContext).inflate(R.layout.activity_signup, parent, false);

            viewHolder = new ViewHolder();

            viewHolder.txtUsername = (TextView) view.findViewById(R.id.username);
            viewHolder.txtlastname = (TextView) view.findViewById(R.id.lastname);
            viewHolder.txtAdress = (TextView) view.findViewById(R.id.adresse);
            viewHolder.txtmail = (TextView) view.findViewById(R.id.mail);
            viewHolder.txtpass= (TextView) view.findViewById(R.id.password);
            viewHolder.txcate= (TextView) view.findViewById(spinner1);
            viewHolder.txtDatebirth= (TextView) view.findViewById(R.id.datenaissance);


            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        userModel model = listItems.get(position);
        viewHolder.txtUsername.setText(model.getFirst_name_user());
        viewHolder.txtlastname.setText(model.getLast_name_user());
        viewHolder.txtAdress.setText(model.getAddress_user());
        viewHolder.txtmail.setText(model.getAddress_user());
        viewHolder.txtpass.setText(model.getAddress_user());
        viewHolder.txcate.setText(model.getAddress_user());
        viewHolder.txtDatebirth.setText(model.getAddress_user());



        return view;

    }
    private static class ViewHolder {
        TextView txtUsername;
        TextView txtlastname;
        TextView txtAdress;
        TextView txtmail;
        TextView txtpass;
        TextView txcate;
        TextView txtDatebirth;

    }
}
*/