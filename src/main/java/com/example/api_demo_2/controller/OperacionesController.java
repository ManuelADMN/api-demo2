package com.example.api_demo_2.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//1 Rest controller: Para que toda la clase se maneje mediante protocolo HTTP
@RestController

//2 RequestMapping - Indicar Ruta de tu API
@RequestMapping("/api/v1")
public class OperacionesController {
    //3 Saludo
    @GetMapping("/hola")
    public String saludoFijo(){
        return "Hola Mundo, My name is";
    }
    //4 Metodo que retorna nombres
    @GetMapping("/mi-nombre")
    public String miNombre(){
        return "Mi nombre es Michael Jordan";
    }
    //5 Metodo que retorna un parametro desde la URL
    @GetMapping("/hello/{nombre}")
    public String saludoDinamico(@PathVariable String nombre){
        return "Hola a todos mi nombre es "+nombre;
    }
    //6 Metodos con operaciones aritmeticas
    @GetMapping("/suma")
    public String suma(){
        int resultado = 5+5;
        return "El resultado es: "+resultado;
    }
    //7 Resta
    @GetMapping("/resta")
    public String resta(){
        int resultado = 5-5;
        return "El resultado es: "+resultado;
    }

    //8 Multiplicacion *
    @GetMapping("/multiplicacion")
    public String multiplicacion(){
        int resultado = 5*5;
        return "El resultado es: "+resultado;
    }

    //9 Division
    @GetMapping("/division")
    public String division(){
        int resultado = 5/5;
        return "El resultado es: "+resultado;
    }

    //10 Metodos reciben parametros por la url operaciones
    @GetMapping("/suma/{a}/{b}")
    public String sumaConParametros(@PathVariable int a, @PathVariable int b){
        return "La suma de "+a+" + "+b+" es: "+(a+b);
    }

    //11
    @GetMapping("/resta/{a}/{b}")
    public String restaConParametros(@PathVariable int a, @PathVariable int b){
        return "La resta de "+a+" - "+b+" es: "+(a-b);
    }
    //12
    @GetMapping("/multiplicacion/{a}/{b}")
    public String multiplicacionConParametros(@PathVariable int a, @PathVariable int b){
        return "La multiplicacion de "+a+" * "+b+" es: "+(a*b);
    }

    //13
    @GetMapping("/division/{a}/{b}")
    public String divisionConParametros(@PathVariable int a, @PathVariable int b){
        if(b==0){
            return "La división por 0 no es posible";
        }
        return "La division de "+a+" / "+b+" es: "+(a/b);
    }

}
