import { TestBed, inject } from '@angular/core/testing';

import { TestngService } from './testng.service';

describe('TestngService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [TestngService]
    });
  });

  it('should be created', inject([TestngService], (service: TestngService) => {
    expect(service).toBeTruthy();
  }));
});
