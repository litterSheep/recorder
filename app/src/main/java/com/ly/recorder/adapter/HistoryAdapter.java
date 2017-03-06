package com.ly.recorder.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.ly.recorder.R;
import com.ly.recorder.db.Account;
import com.ly.recorder.utils.TimeUtil;

import java.util.List;

/**
 * Created by ly on 2017/3/6 15:04.
 */

public class HistoryAdapter extends BaseAdapter {

    private List<Account> mlist;
    private Context context;
    private LayoutInflater inflater;

    public HistoryAdapter(List<Account> mlist, Context context) {
        this.mlist = mlist;
        this.context = context;
        inflater = LayoutInflater.from(context);
    }

    public void add(Account account) {
        mlist.add(0, account);
        notifyDataSetChanged();
    }

    public void setList(List<Account> list) {
        mlist = list;
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return mlist.size();
    }

    @Override
    public Object getItem(int position) {
        return mlist.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder = null;
        if (convertView == null) {
            viewHolder = new ViewHolder();
            convertView = inflater.inflate(R.layout.item_history, null);
            viewHolder.tv_time = (TextView) convertView.findViewById(R.id.tv_item_time);
            viewHolder.tv_money = (TextView) convertView.findViewById(R.id.tv_item_money);
            viewHolder.tv_remark = (TextView) convertView.findViewById(R.id.tv_item_remark);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        Account account = mlist.get(position);

        viewHolder.tv_time.setText(TimeUtil.getDateByMillisecond(account.getTime(), TimeUtil.FORMAT_MONTH_DAY_TIME));
        viewHolder.tv_money.setText(account.getMoney() + "元");
        viewHolder.tv_remark.setText(account.getRemark());

        return convertView;
    }

    class ViewHolder {

        TextView tv_time, tv_money, tv_remark;
    }
}