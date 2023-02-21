class Human:
    def __init__(self, nama='', nik=0, kelamin='-'):
        self.nama = nama
        self.nik = nik
        self.kelamin = kelamin
    
    def get_nama(self):
        return self.nama
    
    def set_nama(self, nama):
        self.nama = nama
    
    def get_nik(self):
        return self.nik
    
    def set_nik(self, nik):
        self.nik = nik
    
    def get_kelamin(self):
        return self.kelamin
    
    def set_kelamin(self, kelamin):
        self.kelamin = kelamin
    
    def __del__(self):
        pass


class Mahasiswa(Human):
    def __init__(self, nama='', nik=0, kelamin='-', nim=0, prodi='-', fakultas='-'):
        super().__init__(nama, nik, kelamin)
        self.nim = nim
        self.prodi = prodi
        self.fakultas = fakultas
    
    def get_nim(self):
        return self.nim
    
    def set_nim(self, nim):
        self.nim = nim
    
    def get_prodi(self):
        return self.prodi
    
    def set_prodi(self, prodi):
        self.prodi = prodi
    
    def get_fakultas(self):
        return self.fakultas
    
    def set_fakultas(self, fakultas):
        self.fakultas = fakultas
    
    def __del__(self):
        pass


class SivitasAkademik(Mahasiswa):
    def __init__(self, nama='', nik=0, kelamin='-', nim=0, prodi='-', fakultas='-', asal_univ='-', email='-'):
        super().__init__(nama, nik, kelamin, nim, prodi, fakultas)
        self.asal_univ = asal_univ
        self.email = email
    
    def get_univ(self):
        return self.asal_univ
    
    def set_univ(self, univ):
        self.asal_univ = univ
    
    def get_email(self):
        return self.email
    
    def set_email(self, email):
        self.email = email
    
    def __del__(self):
        pass