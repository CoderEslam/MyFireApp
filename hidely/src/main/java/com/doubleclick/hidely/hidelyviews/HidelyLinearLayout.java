package com.doubleclick.hidely.hidelyviews;

import android.content.Context;

import android.util.AttributeSet;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.doubleclick.hidely.HidelyAnimationCallbacks;
import com.doubleclick.hidely.HidelyCore;
import com.doubleclick.hidely.HidelyInterface;


public class HidelyLinearLayout extends LinearLayout implements HidelyInterface {
   private HidelyCore hidelyCore;

   public HidelyLinearLayout(@NonNull Context context) {
       super(context);
       initCore();
   }

   public HidelyLinearLayout(@NonNull Context context, @Nullable AttributeSet attrs) {
       super(context, attrs);
       initCore();
   }



   public HidelyLinearLayout(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
       super(context, attrs, defStyleAttr);
       initCore();
   }


   private void initCore() {
       hidelyCore = new HidelyCore(this);
   }


   @Override
   public void show() {
       if (hidelyCore != null)
           hidelyCore.show();
   }

   @Override
   public void hide() {
       if (hidelyCore != null)
           hidelyCore.hide();
   }

   @Override
   public boolean isShowing() {
       return hidelyCore == null ? false : hidelyCore.isShowing();
   }

   @Override
   public void setAnimationCallbacks(HidelyAnimationCallbacks animationCallbacks) {
       hidelyCore.setAnimationListener(animationCallbacks);
   }
}
