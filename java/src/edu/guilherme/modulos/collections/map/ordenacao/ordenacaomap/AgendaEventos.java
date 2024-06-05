package edu.guilherme.modulos.collections.map.ordenacao.ordenacaomap;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class AgendaEventos{
     private Map <LocalDate, Evento> eventosMap;

     public AgendaEventos(){
          this.eventosMap = new HashMap<>();
     }

     public void adicionarEvento(LocalDate data, String nome, String atracao){
          Evento evento = new Evento(nome, atracao);
          eventosMap.put(data, new Evento(nome, atracao));
     }

     public void exibirAgenda(){
          Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
          System.out.println(eventosTreeMap);
     }

     public void obterProximoEvento(){
          
          LocalDate dataAtual = LocalDate.now();
          LocalDate proximaDate = null;
          Evento proximoEvento = null;
          Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
          
          for(Map.Entry<LocalDate, Evento> entry : eventosMap.entrySet()){
               if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                    proximaDate = entry.getKey();
                    
                    proximoEvento = entry.getValue();

                    System.out.println("O próximo evento: " +proximoEvento+ " acontecerá na data " +proximaDate);
                    break;
               }
          }

     }
     public static void main(String[] args) {
          AgendaEventos agendaEventos = new AgendaEventos();
          
          agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JULY, 15), "Evento 1", "Atração");
          agendaEventos.adicionarEvento(LocalDate.of(2022, 7, 9), "Evento 2", "Atração 2");
          agendaEventos.adicionarEvento(LocalDate.of(2020, Month.JANUARY, 10), "Evento 3", "Atração 3");
          agendaEventos.adicionarEvento(LocalDate.of(2025, 5, 30), "Meu aniversario", "festa");

          agendaEventos.exibirAgenda();
          agendaEventos.obterProximoEvento();


     }
     
     
}