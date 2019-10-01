package com.example.freecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
//todo: colocar botão del para funcionar;
//todo: criar operações matemáticas
//todo: corrigir bug da saída de texto

class MainActivity : AppCompatActivity() {
    fun exibirNúmeros(){
        this.visorDeNúmeros.setText(número1+operação+número2)
    }
    var número1:String=""
    var número2:String=""
    var operação:String=""
    var controle:String="esperando1"
    fun clickNo7(view: View){
        if (this.controle=="esperando1"){
            número1+="7"
        }
        else {
            número2+="7"
        }
        this.exibirNúmeros()
    }
    fun clickNo8(view: View){
        if (this.controle=="esperando1"){
            número1 +="8"
        }
        else {
            número2+="8"

        }
        this.exibirNúmeros()
    }
    fun clickNo9(view: View){
        if (this.controle=="esperando1"){
            número1 +="9"
        }
        else {
            número2+="9"
        }
        this.exibirNúmeros()
    }
    fun clickNo6(view: View){
        if (this.controle=="esperando1"){
            número1 +="6"
        }
        else {
            número2+="6"
        }
        this.exibirNúmeros()
    }
    fun clickNo5(view: View){
        if (this.controle=="esperando1"){
            número1+="5"
        }
        else {
            número2+="5"
        }
        this.exibirNúmeros()
    }
    fun clickNo4(view: View){
        if (this.controle=="esperando1"){
            número1 +="4"
        }
        else {
            número2+="4"
        }
        this.exibirNúmeros()
    }
    fun clickNo3(view: View){
        if (this.controle=="esperando1"){
            número1 +="3"
        }
        else {
            número2+="3"
        }
        this.exibirNúmeros()
    }
    fun clickNo2(view: View){
        if (this.controle=="esperando1"){
            número1+="2"
        }
        else {
            número2+="2"
        }
        this.exibirNúmeros()
    }
    fun clickNo1(view: View){
        if (this.controle=="esperando1"){
            número1+="1"
        }
        else {
            número2+="1"
        }
        this.exibirNúmeros()
    }
    fun clickNo0(view: View){
        if (this.controle=="esperando1"){
            número1+="0"
        }
        else {
            número2+="0"
        }
        this.exibirNúmeros()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        this.btn7.setOnClickListener(::clickNo7)
        this.btn8.setOnClickListener(::clickNo8)
        this.btn9.setOnClickListener(::clickNo9)
        this.btn6.setOnClickListener(::clickNo6)
        this.btn5.setOnClickListener(::clickNo5)
        this.btn4.setOnClickListener(::clickNo4)
        this.btn3.setOnClickListener(::clickNo3)
        this.btn2.setOnClickListener(::clickNo2)
        this.btn1.setOnClickListener(::clickNo1)
        this.btn0.setOnClickListener(::clickNo0)
        this.btnD.setOnClickListener(::clickNaDivisão)
        this.btnMais.setOnClickListener(::clickNoMais)
        this.btnMenos.setOnClickListener(::clickNoMenos)
        this.btnMultiplicação.setOnClickListener(::clickNaMultplicação)
        this.delete.setOnClickListener(::clickNoDelete)


    }
    fun clickNaDivisão(view: View)
    {
        this.operação="/"
        this.controle="esperando2"
    }
    fun  clickNoMais(view: View)
    {
        this.operação="+"
        this.controle="esperando2"
    }
    fun clickNoMenos(view: View)
    {
        this.operação="-"
        this.controle="esperando2"
    }
    fun clickNaMultplicação(view: View)
    {
        this.operação="x"
        this.controle="esperando2"
    }
    fun clickNoDelete(view: View)
    {}
}
