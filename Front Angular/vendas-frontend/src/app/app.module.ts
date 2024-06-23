import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { RouterModule } from '@angular/router';
import { AppRoutingModule } from './app-routing.module';

import { AppComponent } from './app.component';
import { PessoaComponent } from './pessoa/pessoa.component';
import { ItemVendaComponent } from './item-venda/item-venda.component';

@NgModule({
  declarations: [
    AppComponent,
    PessoaComponent,
    ItemVendaComponent
  ],
  imports: [
    BrowserModule,
    RouterModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }