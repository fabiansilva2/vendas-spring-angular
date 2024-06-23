import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { PessoaComponent } from './pessoa/pessoa.component';
import { ItemVendaComponent } from './item-venda/item-venda.component';

const routes: Routes = [
  { path: 'pessoas', component: PessoaComponent },
  { path: 'itens', component: ItemVendaComponent },
  { path: '', redirectTo: '/pessoas', pathMatch: 'full' }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
