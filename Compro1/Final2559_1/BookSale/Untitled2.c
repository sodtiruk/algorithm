struct{
    int id;
    char name[52];
    int salePrice; // ราคาขาย
    int basePrice; // ราคาทุน
    int count;
}typedef BOOK;
BOOK books[5000];
void main(){
    int N, P;
    char dummy[10]; // for storing end-line/new-line characters
    scanf("%d", &N);
    for(int i = 0; i < N; ++i) {
        scanf("%d", &books[i].id);
        // อ่านตัวอักษรมาไม่เกิน 99 ตัว หรือพบการขึ้นบรรทัดใหม่ (มีช่องว่างหน้า % ด้วยนะ)
        scanf(" %99[^\n]", books[i].name);
        int nameLength = strlen(books[i].name);
        books[i].name[nameLength-1] = 0; // ลบตัวขึ้นบรรทัดใหม่ออก
        scanf("%d", &books[i].salePrice);
        scanf("%d", &books[i].basePrice);
        books[i].count = 0;
    }
    // ต่อไปนี้คืองานของคุณที่จะต้องเพิ่มโค้ดลงไปทางด้านใต้นี้ เพื่อให้โปรแกรมบันทึกการซื้อขายและ
    // รายงานการขายได้

    int n;
    scanf("%d", &n);
    for(int i=0; i<n; i++){
        int fuc;
        scanf("%d", &fuc);
        if (fuc == 1){
            int ids, want;
            scanf("%d", &ids, &want);
            for(int j=0; j<N; j++){
                if (ids == books[j].id){
                    books[j].count += want;
                }
            }
        }else if (fuc == 2){
            int ids;
            scanf("%d", &ids);
            for(int j=0; j<N; j++){
                if (ids == books[j].id){
                    printf("%d %s %d %d %d\n", books[j].id, books[j].name, books[j].count, books[i].salePrice, books[i].basePrice);
                }
            }
        }
    }
}
