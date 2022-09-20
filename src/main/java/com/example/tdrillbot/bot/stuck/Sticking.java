package com.example.tdrillbot.bot.stuck;

import com.example.tdrillbot.bot.Bot;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.*;

@Component
public class Sticking {
   private Map<Integer, String> typeStickingList;
   private ReplyKeyboardMarkup replyKeyboardMarkup;
   private Bot bot;


   public Sticking() {
      doListSticking();
   }

   private void doListSticking(){
      typeStickingList = new HashMap<>();
      typeStickingList.put(1, "Прихват шламом или обвалившейся породой");
      typeStickingList.put(2, "Дифференциальный прихват");
      typeStickingList.put(3, "Заклинивание на участке со сложной геометрией ствола");
   }

   public String findStickingType(){
      return "вызов метода по поиску типа прихвата";
   }



//   DIFFERENTIAL, //дифференциальный прихват
//   MECHANICAL, //заклинивание на участке со сложной геометрией ствола
//   COLLAPSES //прихват шламом или обвалившейся породой
}
