package itprogerr.displayingEntriesOnTelegram.conroller;

import itprogerr.displayingEntriesOnTelegram.models.Record;
import itprogerr.displayingEntriesOnTelegram.repo.RecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.util.List;

@Controller
public class UserController{
    @Autowired
    private RecordRepository recordRepository;


    @GetMapping
    public String index(Model model, @RequestParam(value = "date",required = false) String dataStr){
        List<Record> records;

        if (dataStr !=null && !dataStr.isEmpty()){
            LocalDate date = LocalDate.parse(dataStr);
            records = recordRepository.findByAppointmentDate(date);
        }else {
            records = recordRepository.findAll();
        }
        model.addAttribute("records",records);
        model.addAttribute("selectedDate",dataStr);
        return "index";
    }
        @GetMapping("/login")
                public String login(){
            return "login";
        }


    @GetMapping("/reg")
    public String reg(){
        return "reg";
    }
    }


