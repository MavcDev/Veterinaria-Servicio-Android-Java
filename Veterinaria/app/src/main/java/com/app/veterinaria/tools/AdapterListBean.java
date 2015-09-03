package com.app.veterinaria.tools;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Locale;

import com.app.veterinaria.R;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by Cananguchal Code on 27/07/2015.
 */
public class AdapterListBean extends BaseAdapter {

    private String initTitle,initDescription;
    private Context context;
    private Class classActivity;
    private LayoutInflater layoutInflater;
    private List<DataViewList> listData;
    private ArrayList<DataViewList> arrayData;
    private boolean permisoClick;

    public AdapterListBean(Context context, List<DataViewList> listData, Class classActivity, String initTitle,String initDescription,boolean permisoClick) {
        this.context = context;
        this.listData = listData;
        this.classActivity = classActivity;
        this.initDescription = initDescription;
        this.initTitle = initTitle;
        this.permisoClick  = permisoClick;
        layoutInflater = LayoutInflater.from(context);
        this.arrayData = new ArrayList<DataViewList>();
        this.arrayData.addAll(listData);
    }

    @Override
    public int getCount() {
        return listData.size();
    }

    @Override
    public DataViewList getItem(int position) {
        return listData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        final  ViewListBean viewListBean;
        if(convertView == null) {
            viewListBean = new ViewListBean();
            convertView = layoutInflater.inflate(R.layout.listviewbean, null);
            viewListBean.title = (TextView) convertView.findViewById(R.id.labelViewTitle);
            viewListBean.description = (TextView) convertView.findViewById(R.id.labelViewDescription);
            convertView.setTag(viewListBean);
        }else{
            viewListBean = (ViewListBean) convertView.getTag();
        }
        viewListBean.title.setText(initTitle + listData.get(position).getTitle());
        viewListBean.description.setText(initDescription + listData.get(position).getDescription());

        if(permisoClick) {
            convertView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    final String idBean = listData.get(position).getId();
                    Intent intent = new Intent(context, classActivity);
                    intent.putExtra("id", idBean);
                    context.startActivity(intent);
                }
            });
        }

        return convertView;
    }

    public void filter(String charText) {
        charText = charText.toLowerCase(Locale.getDefault());
        listData.clear();
        if (charText.length() == 0) {
            listData.addAll(arrayData);
        }
        else
        {
            for (DataViewList dataList : arrayData)
            {
                if (dataList.getTitle().toLowerCase(Locale.getDefault()).contains(charText) || dataList.getDescription().toLowerCase(Locale.getDefault()).contains(charText) || dataList.getId().toLowerCase(Locale.getDefault()).contains(charText))
                {
                    listData.add(dataList);
                }
            }
        }
        notifyDataSetChanged();
    }
}
