<template>
    <div class="button">
        <div>{{ count }}</div>
        <div @click="counter" class="btn operator">클릭수 올리기</div>
        <div @click="clear" class="btn operator">초기화</div>
    </div>
</template>

<script>
    export default {
        data () {
            return {
                count: 0
            }
        },
        methods: {
            counter () {
                this.count++
            },
            clear () {
                return {
                    count: 0
                }
            }
        }
    }
</script>

<style scoped>
</style>