import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListeVolComponent } from './liste-vol.component';

describe('ListeVolComponent', () => {
  let component: ListeVolComponent;
  let fixture: ComponentFixture<ListeVolComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ListeVolComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ListeVolComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
